package ProjectMaven.Maven.apiserver.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.cloud.gateway.support.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.http.codec.HttpMessageWriter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.Assert;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.result.view.ViewResolver;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :  zhangqian9158@gmail.com
 */
@Slf4j
public class JsonExceptionHandler implements ErrorWebExceptionHandler {

    private List<HttpMessageReader<?>> messageReaders = Collections.emptyList();

    private List<HttpMessageWriter<?>> messageWriters = Collections.emptyList();

    private List<ViewResolver> viewResolvers = Collections.emptyList();

    private ThreadLocal<Map<String, Object>> exceptionHandlerResult = new ThreadLocal<>();

    public void setMessageReaders(List<HttpMessageReader<?>> messageReaders) {
        Assert.notNull(messageReaders, "'messageReaders' must not be null");
        this.messageReaders = messageReaders;
    }

    public void setViewResolvers(List<ViewResolver> viewResolvers) {
        this.viewResolvers = viewResolvers;
    }

    public void setMessageWriters(List<HttpMessageWriter<?>> messageWriters) {
        Assert.notNull(messageWriters, "'messageWriters' must not be null");
        this.messageWriters = messageWriters;
    }

    protected Mono<ServerResponse> renderErrorResponse(ServerRequest request) {
        Map<String, Object> result = exceptionHandlerResult.get();
        return ServerResponse.status((HttpStatus) result.get("httpStatus"))
                .body(BodyInserters.fromValue(result.get("body")));
    }

    private Mono<? extends Void> write(ServerWebExchange exchange, ServerResponse response) {
        exchange.getResponse().getHeaders().setContentType(response.headers().getContentType());
        return response.writeTo(exchange, new ResponseContext());
    }

    @Override
    public Mono<Void> handle(ServerWebExchange serverWebExchange, Throwable throwable) {
        // ??????????????????????????????
        HttpStatus httpStatus;
        String body;
        if (throwable instanceof NotFoundException) {
            httpStatus = HttpStatus.NOT_FOUND;
            body = "Service Not Found";
        } else if (throwable instanceof ResponseStatusException) {
            ResponseStatusException responseStatusException = (ResponseStatusException) throwable;
            httpStatus = responseStatusException.getStatus();
            body = responseStatusException.getMessage();
        } else if (throwable instanceof BlockException) {
            httpStatus = HttpStatus.valueOf(429);
            body = "???????????? ?????????????????????";
        } else {
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            body = "?????????????????????";
        }

        ServerHttpRequest request = serverWebExchange.getRequest();
        // ??????????????????
        Map<String, Object> result = new HashMap<>(2, 1);
        result.put("httpStatus", httpStatus);
        String msg = "{\"code\":" + httpStatus.value() + ",\"message\": \"" + body + "\",\"data\":\""
                + request.getPath() + "\"}";
        result.put("body", msg);

        // ????????????
        log.error("[??????????????????]\r\n???????????????{}\r\n???????????????{}", request.getPath(), throwable.getMessage());

        if (serverWebExchange.getResponse().isCommitted()) {
            return Mono.error(throwable);
        }
        exceptionHandlerResult.set(result);
        ServerRequest newRequest = ServerRequest.create(serverWebExchange, this.messageReaders);
        return RouterFunctions.route(RequestPredicates.all(), this::renderErrorResponse).route(newRequest)
                .switchIfEmpty(Mono.error(throwable)).flatMap((handler) -> handler.handle(newRequest))
                .flatMap((response) -> write(serverWebExchange, response));
    }

    private class ResponseContext implements ServerResponse.Context {

        @Override
        public List<HttpMessageWriter<?>> messageWriters() {
            return JsonExceptionHandler.this.messageWriters;
        }

        @Override
        public List<ViewResolver> viewResolvers() {
            return JsonExceptionHandler.this.viewResolvers;
        }

    }

}
