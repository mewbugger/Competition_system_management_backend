package com.wly.competition_system_management_backend.controller;

import com.wly.competition_system_management_backend.common.BaseResponse;
import com.wly.competition_system_management_backend.common.ErrorCode;
import com.wly.competition_system_management_backend.common.ResultUtils;
import com.wly.competition_system_management_backend.exception.BusinessException;
import com.wly.competition_system_management_backend.model.domain.User;
import com.wly.competition_system_management_backend.model.query.UserQuery;
import com.wly.competition_system_management_backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *  用户接口
 */
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:3000"})
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/test")
    public void test() {
        System.out.println("this is a test");
    }

    @GetMapping("/list")
    public BaseResponse<List<User>> listAllUser() {
        List<User> users = userService.listAllUser();
        return ResultUtils.success(users);
    }

    @GetMapping("/list/page")
    public BaseResponse<List<User>> listAllUserByPage(int pageNum, int pageSize) {
        List<User> users = userService.listAllUserByPage(pageNum, pageSize);
        return ResultUtils.success(users);
    }

    @PostMapping("/search")
    public BaseResponse<User> queryOneUser(@RequestBody UserQuery userQuery) {
        if (userQuery == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        User user = userService.queryOneUser(userQuery);
        return ResultUtils.success(user);
    }

    @PostMapping("/delete")
    public BaseResponse<Integer> deleteUserById(@RequestBody long id) {
        if (id <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Integer result = userService.deleteUserById(id);
        return ResultUtils.success(result);
    }



}
