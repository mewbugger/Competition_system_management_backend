package com.wly.competition_system_management_backend;

import com.wly.competition_system_management_backend.mapper.CompetitionMapper;
import com.wly.competition_system_management_backend.model.domain.Competition;
import com.wly.competition_system_management_backend.model.domain.Team;
import com.wly.competition_system_management_backend.service.CompetitionService;
import com.wly.competition_system_management_backend.service.TeamService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class CompetitionSystemManagementBackendApplicationTests {

    @Resource
    private CompetitionService competitionService;

    @Resource
    private CompetitionMapper competitionMapper;

    @Resource
    private TeamService teamService;

    @Test
    void contextLoads() {
    }

    @Test
    void testCompetition() {
        List<Competition> competitions = competitionService.listAllCompetition();
        System.out.println(competitions);
    }

    @Test
    void testTeam() {
        List<Team> teams = teamService.listAllTeam();
        System.out.println(teams);
    }

}
