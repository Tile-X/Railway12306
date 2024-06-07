package icat.app.railway.service.user.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import icat.app.railway.framework.database.base.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户注销表实体对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user_deletion")
public class UserDeletionDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 证件类型
     */
    private Integer idType;

    /**
     * 证件号
     */
    private String idCard;
}
