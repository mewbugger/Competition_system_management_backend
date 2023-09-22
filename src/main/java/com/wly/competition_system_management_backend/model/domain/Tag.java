package com.wly.competition_system_management_backend.model.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Tag implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;


    /**
     * 标签名称
     */
    private String tagName;

    /**
     * 父标签id
     */
    private Long userId;

    /**
     * 0-不是，1-父标签
     */
    private Byte parentId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Byte isDelete;

}
