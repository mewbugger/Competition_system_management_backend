package com.wly.competition_system_management_backend.service.impl;

import com.wly.competition_system_management_backend.mapper.CompetitionMapper;
import com.wly.competition_system_management_backend.model.domain.Competition;
import com.wly.competition_system_management_backend.service.CompetitionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Resource
    private CompetitionMapper competitionMapper;
    @Override
    public List<Competition> listAllCompetition() {
        return competitionMapper.listAllCompetition();
    }
}
