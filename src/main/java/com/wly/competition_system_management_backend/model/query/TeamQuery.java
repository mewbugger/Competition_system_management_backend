package com.wly.competition_system_management_backend.model.query;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("teamQuery")
public class TeamQuery implements Serializable {
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
     * 队长id
     */
    private Long userId;
}
