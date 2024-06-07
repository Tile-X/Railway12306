package icat.app.railway.service.user.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import icat.app.railway.framework.database.base.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户名复用表实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user_reuse")
public class UsernameReuseDO extends BaseDO {

    /**
     * 用户名
     */
    private String username;
}
