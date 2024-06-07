package icat.app.railway.service.user.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icat.app.railway.service.user.dao.entity.UserPhoneDO;

/**
 * 用户手机号表持久层
 */
public interface UserPhoneMapper extends BaseMapper<UserPhoneDO> {

    /**
     * 注销用户
     *
     * @param userPhoneDO 注销用户入参
     */
    void deletionUser(UserPhoneDO userPhoneDO);
}
