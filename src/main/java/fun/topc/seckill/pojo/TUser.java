package fun.topc.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author eric
 * @since 2023-11-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID，手机号码
     */
    private Long id;

    private String nickname;

    /**
     * MD5(MD5(pass明文+固定salt)+salt)
     */
    private String password;

    private String salt;

    /**
     * 用户的头像
     */
    private String head;

    /**
     * 账号的注册时间
     */
    private Date registerDate;

    /**
     * 最后一次登录的时间
     */
    private Date lastLoginDate;

    /**
     * 登录次数
     */
    private Integer loginCount;


}
