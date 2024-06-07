package icat.app.railway.service.user.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icat.app.railway.service.user.dao.entity.UserMailDO;

/**
 * 用户邮箱表持久层
 */
public interface UserMailMapper extends BaseMapper<UserMailDO> {

    /**
     * 注销用户
     *
     * @param userMailDO 注销用户入参
     */
    void deletionUser(UserMailDO userMailDO);
}
