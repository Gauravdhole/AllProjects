package ProjectMaven.Maven;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhangqian9158@gmail.com
 */
@EnableDubbo
@SpringBootApplication
public class BizQuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizQuickstartApplication.class, args);
	}

}
