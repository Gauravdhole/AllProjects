package ProjectMaven.Maven.biz.api.impl;

import com.chinagoods.framework.thinkcloud.commons.business.api.impl.BaseServiceImpl;
import ProjectMaven.Maven.biz.api.UmsUserService;
import ProjectMaven.Maven.domain.UmsUser;
import ProjectMaven.Maven.repo.api.UmsUserRepository;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserServiceImpl extends BaseServiceImpl<UmsUserRepository, UmsUser> implements UmsUserService {

//    @DubboReference(version = "1.0.0")
//    private UmsUserRepository umsUserRepository;
}
