package com.liugang.alibabacloud.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.liugang.alibabacloud.id.SnowFlakeFactory;
import com.liugang.alibabacloud.passwd.PasswordUtils;
import lombok.Data;

@Data
@TableName("t_user")
public class User {

    private static final long serialVersionUID = -7032479567987350240L;

    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 用户名
     */
    @TableField("t_username")
    private String username;

    /**
     * 密码
     */
    @TableField("t_password")
    private String password;

    /**
     * 手机号
     */
    @TableField("t_phone")
    private String phone;

    /**
     * 地址
     */
    @TableField("t_address")
    private String address;

    public User(){
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
        //默认密码
        this.password = PasswordUtils.getPassowrd("123456");
    }
}
