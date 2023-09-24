package com.wly.competition_system_management_backend.service.impl;

import com.wly.competition_system_management_backend.common.ErrorCode;
import com.wly.competition_system_management_backend.exception.BusinessException;
import com.wly.competition_system_management_backend.mapper.CompetitionMapper;
import com.wly.competition_system_management_backend.model.domain.Competition;
import com.wly.competition_system_management_backend.model.query.CompetitionQuery;
import com.wly.competition_system_management_backend.model.request.CompetitionUpdateRequest;
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
        List<Competition> competitions = competitionMapper.listAllCompetition();
        if (competitions == null) {
            throw new BusinessException(ErrorCode.FAIL, "查询的竞赛列表不存在");
        }
        return competitions;
    }

    @Override
    public Integer deleteCompetitionById(Long id) {
        Integer result = competitionMapper.deleteCompetitionById(id);
        if (result == 0) {
            throw new BusinessException(ErrorCode.FAIL, "需要删除的竞赛不存在");
        }
        return result;
    }

    @Override
    public Competition queryOneCompetition(CompetitionQuery competitionQuery) {
        Competition competition = competitionMapper.queryOneCompetition(competitionQuery);
        if (competition == null) {
            throw new BusinessException(ErrorCode.FAIL, "查询的竞赛不存在");
        }
        return competition;
    }

    @Override
    public Integer updateCompetitionById(CompetitionUpdateRequest competitionUpdateRequest) {
        Integer result = competitionMapper.updateCompetitionById(competitionUpdateRequest);
        if (result == 0) {
            throw new BusinessException(ErrorCode.FAIL, "需要修改竞赛不存在");
        }
        return result;
    }
}
