package com.wly.competition_system_management_backend.model.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;


    /**
     * 队伍名称
     */
    private String name;


    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    /**
     * 队长id
     */
    private Long userId;

    /**
     * 是否删除
     */
    private Byte isDelete;


    /**
     *  队伍密码
     */
    private String password;

}
