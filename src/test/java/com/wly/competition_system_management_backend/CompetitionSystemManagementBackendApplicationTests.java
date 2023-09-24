package com.wly.competition_system_management_backend;

import com.wly.competition_system_management_backend.model.domain.Competition;
import com.wly.competition_system_management_backend.model.domain.Team;
import com.wly.competition_system_management_backend.model.domain.User;
import com.wly.competition_system_management_backend.model.query.CompetitionQuery;
import com.wly.competition_system_management_backend.model.query.TeamQuery;
import com.wly.competition_system_management_backend.model.query.UserQuery;
import com.wly.competition_system_management_backend.model.request.CompetitionUpdateRequest;
import com.wly.competition_system_management_backend.model.request.UserUpdateRequest;
import com.wly.competition_system_management_backend.service.CompetitionService;
import com.wly.competition_system_management_backend.service.TeamService;
import com.wly.competition_system_management_backend.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = CompetitionSystemManagementBackendApplication.class)
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
        List<User> users = userService.listAllUserByPage(1, 2);
        System.out.println(users);
    }

    @Test
    void testQueryOneUser() {
        UserQuery userQuery = new UserQuery();
        userQuery.setUserName("健身战士");
        User user = userService.queryOneUser(userQuery);
        System.out.println(user);
    }

    @Test
    void testDeleteUserById() {
        Integer result = userService.deleteUserById(3L);
        System.out.println(result);
    }

    @Test
    void testDeleteTeamById() {
        Integer result = teamService.deleteTeamById(3L);
        System.out.println(result);
    }

    @Test
    void testQueryOneTeam(){
        TeamQuery teamQuery = new TeamQuery();
        teamQuery.setName("自动驾驶队");
        Team team = teamService.queryOneTeam(teamQuery);
        System.out.println(team);
    }

    @Test
    void testDeleteCompetitionById() {
        Integer result = competitionService.deleteCompetitionById(1L);
        System.out.println(result);
    }

    @Test
    void testQueryOneCompetition(){
        CompetitionQuery competitionQuery = new CompetitionQuery();
        competitionQuery.setLevel("省级");
        Competition competition = competitionService.queryOneCompetition(competitionQuery);
        System.out.println(competition);
    }

    @Test
    void testUpdateUserById(){
        UserUpdateRequest userUpdateRequest = new UserUpdateRequest();
        userUpdateRequest.setId(1L);
        userUpdateRequest.setUserName("健身战士");
        Integer result = userService.updateUserById(userUpdateRequest);
        System.out.println(result);
        UserQuery userQuery = new UserQuery();
        userQuery.setId(userUpdateRequest.getId());
        User user = userService.queryOneUser(userQuery);
        System.out.println("================");
        System.out.println("更新后的用户是");
        System.out.println(user);
    }

    @Test
    void testUpdateCompetitionById() {
        CompetitionUpdateRequest competitionUpdateRequest = new CompetitionUpdateRequest();
        competitionUpdateRequest.setId(1L);
        competitionUpdateRequest.setName("Kaggle");
        Integer result = competitionService.updateCompetitionById(competitionUpdateRequest);
        System.out.println(result);
        CompetitionQuery competitionQuery = new CompetitionQuery();
        competitionQuery.setId(competitionUpdateRequest.getId());
        Competition competition = competitionService.queryOneCompetition(competitionQuery);
        System.out.println("================");
        System.out.println("更新后的竞赛是");
        System.out.println(competition);
    }






}
