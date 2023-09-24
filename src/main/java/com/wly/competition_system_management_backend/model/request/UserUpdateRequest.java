package com.wly.competition_system_management_backend.model.request;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("userUpdateRequest")
public class UserUpdateRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;


    /**
     * id
     */
    private Long id;


    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;
}
