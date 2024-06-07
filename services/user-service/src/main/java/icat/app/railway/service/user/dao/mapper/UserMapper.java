package icat.app.railway.service.user.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icat.app.railway.service.user.dao.entity.UserDO;

/**
 * 用户信息表持久层
 */
public interface UserMapper extends BaseMapper<UserDO> {
    
    /**
     * 注销用户
     *
     * @param userDO 注销用户入参
     */
    void deletionUser(UserDO userDO);
}
