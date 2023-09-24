package com.wly.competition_system_management_backend.model.request;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;


@Data
@Alias("competitionUpdateRequest")
public class CompetitionUpdateRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

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
     * 过期时间
     */
    private Date expireTime;
}
