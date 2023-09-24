package com.wly.competition_system_management_backend.service;

import com.wly.competition_system_management_backend.model.domain.Team;
import com.wly.competition_system_management_backend.model.query.TeamQuery;

import java.util.List;


public interface TeamService {

    public List<Team> listAllTeam();

    public Integer deleteTeamById(Long id);

    public Team queryOneTeam(TeamQuery teamQuery);

}
