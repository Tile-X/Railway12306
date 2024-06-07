package icat.app.railway.service.user.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import icat.app.railway.framework.database.base.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户手机号实体对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user_phone")
public class UserPhoneDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 注销时间戳
     */
    private Long deletionTime;
}
