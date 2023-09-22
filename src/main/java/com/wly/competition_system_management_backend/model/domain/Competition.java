package com.wly.competition_system_management_backend.model.domain;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

@Data
public class Competition implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;


    /**
     *  竞赛名称
     */
    private String name;


    /**
     *  竞赛等级
     */
    private String level;


    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 是否删除
     */
    private Byte isDelete;
}
