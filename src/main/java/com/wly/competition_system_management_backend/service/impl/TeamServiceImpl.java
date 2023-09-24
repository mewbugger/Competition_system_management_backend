package com.wly.competition_system_management_backend.service.impl;

import com.wly.competition_system_management_backend.common.ErrorCode;
import com.wly.competition_system_management_backend.exception.BusinessException;
import com.wly.competition_system_management_backend.mapper.TeamMapper;
import com.wly.competition_system_management_backend.model.domain.Team;
import com.wly.competition_system_management_backend.model.query.TeamQuery;
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
        List<Team> teams = teamMapper.listAllTeam();
        if (teams == null) {
            throw new BusinessException(ErrorCode.FAIL, "查询的队伍列表不存在");
        }
        return teams;
    }

    @Override
    public Integer deleteTeamById(Long id) {
        Integer result = teamMapper.deleteTeamById(id);
        if (result == 0) {
            throw new BusinessException(ErrorCode.FAIL, "需要删除的队伍不存在");
        }
        return result;
    }

    @Override
    public Team queryOneTeam(TeamQuery teamQuery) {
        Team team = teamMapper.queryOneTeam(teamQuery);
        if (team == null) {
            throw new BusinessException(ErrorCode.FAIL, "查询的队伍不存在");
        }
        return team;
    }
}
