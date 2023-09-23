package com.wly.competition_system_management_backend;

import com.wly.competition_system_management_backend.common.BaseResponse;
import com.wly.competition_system_management_backend.model.domain.Competition;
import com.wly.competition_system_management_backend.model.domain.Team;
import com.wly.competition_system_management_backend.model.domain.User;
import com.wly.competition_system_management_backend.model.query.UserQuery;
import com.wly.competition_system_management_backend.service.CompetitionService;
import com.wly.competition_system_management_backend.service.TeamService;
import com.wly.competition_system_management_backend.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class CompetitionSystemManagementBackendApplicationTests {

    @Resource
    private CompetitionService competitionService;

    @Resource
    private UserService userService;

    @Resource
    private TeamService teamService;

    @Test
    void contextLoads() {
    }

    @Test
    void testCompetitionForList() {
        List<Competition> competitions = competitionService.listAllCompetition();
        System.out.println(competitions);
    }

    @Test
    void testTeamForList() {
        List<Team> teams = teamService.listAllTeam();
        System.out.println(teams);
    }

    @Test
    void testUserForList() {
        List<User> users = userService.listAllUser();
        System.out.println(users);
    }

    @Test
    void testUserForListByPage() {
        BaseResponse<List<User>> listBaseResponse = userService.listAllUserByPage(2, 2);
        System.out.println(listBaseResponse);
    }

    @Test
    void testQueryOneUser() {
        UserQuery userQuery = new UserQuery();
        userQuery.setId(3L);
        BaseResponse<User> result = userService.queryOneUser(userQuery);
        System.out.println(result);
        System.out.println(result.getData());
        System.out.println(result.getMessage());

    }

    @Test
    void testDeleteUserById() {
        BaseResponse<Integer> result = userService.deleteUserById(2L);
        System.out.println(result);
        System.out.println(result.getData());
        System.out.println(result.getMessage());
    }



}
