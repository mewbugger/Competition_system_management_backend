package com.wly.competition_system_management_backend.service.impl;

import com.wly.competition_system_management_backend.mapper.TeamMapper;
import com.wly.competition_system_management_backend.model.domain.Team;
import com.wly.competition_system_management_backend.service.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Resource
    private TeamMapper teamMapper;
    @Override
    public List<Team> listAllTeam() {
        return teamMapper.listAllTeam();
    }
}
