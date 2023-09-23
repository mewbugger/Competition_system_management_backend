package com.wly.competition_system_management_backend.model.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.io.Serializable;

@Data
//该注解不区分大小写
@Alias("competition")
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
    private Integer isDelete;
}
