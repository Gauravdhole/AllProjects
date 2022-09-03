package ProjectMaven.Maven.repo.api.impl;

import ProjectMaven.Maven.domain.UmsUser;
import ProjectMaven.Maven.repo.api.UmsUserRepository;
import ProjectMaven.Maven.repo.mapper.UmsUserMapper;
import com.chinagoods.framework.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserRepositoryImpl extends BaseRepositoryImpl<UmsUserMapper, UmsUser> implements UmsUserRepository {
}
