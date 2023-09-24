package com.wly.competition_system_management_backend.service;

import com.wly.competition_system_management_backend.model.domain.Competition;
import com.wly.competition_system_management_backend.model.query.CompetitionQuery;
import com.wly.competition_system_management_backend.model.request.CompetitionUpdateRequest;

import java.util.List;


public interface CompetitionService {

    public List<Competition> listAllCompetition();

    public Integer deleteCompetitionById(Long id);

    public Competition queryOneCompetition(CompetitionQuery competitionQuery);

    public Integer updateCompetitionById(CompetitionUpdateRequest competitionUpdateRequest);

}
