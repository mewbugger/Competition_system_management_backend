package com.wly.competition_system_management_backend.mapper;

import com.wly.competition_system_management_backend.model.domain.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeamMapper {

    List<Team> listAllTeam();
}
