package com.wly.competition_system_management_backend.mapper;

import com.wly.competition_system_management_backend.model.domain.Competition;
import com.wly.competition_system_management_backend.model.query.CompetitionQuery;
import com.wly.competition_system_management_backend.model.request.CompetitionUpdateRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompetitionMapper {

    List<Competition> listAllCompetition();

    Integer deleteCompetitionById(Long id);

    Competition queryOneCompetition(CompetitionQuery competitionQuery);

    Integer updateCompetitionById(CompetitionUpdateRequest competitionUpdateRequest);
}
