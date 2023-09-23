package com.wly.competition_system_management_backend.service.impl;

import com.github.pagehelper.PageHelper;
import com.wly.competition_system_management_backend.common.BaseResponse;
import com.wly.competition_system_management_backend.common.ErrorCode;
import com.wly.competition_system_management_backend.common.ResultUtils;
import com.wly.competition_system_management_backend.mapper.UserMapper;
import com.wly.competition_system_management_backend.model.domain.User;
import com.wly.competition_system_management_backend.model.query.UserQuery;
import com.wly.competition_system_management_backend.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> listAllUser() {
        return userMapper.listAllUser();
    }

    @Override
    public BaseResponse<List<User>> listAllUserByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.listAllUser();
        return ResultUtils.success(users);
    }

    @Override
    public BaseResponse<Integer> deleteUserById(Long id) {
        UserQuery userQuery = new UserQuery();
        userQuery.setId(id);
        User user = userMapper.queryOneUser(userQuery);
        if(user == null) {
            return ResultUtils.error(ErrorCode.FAIL, "该用户不存在");
        }
        //在mapper通过sq来判断isDelete的值
//        if (user.getIsDelete() == 1) {
//            return ResultUtils.error(ErrorCode.FAIL, "该用户已经删除");
//        }
        Integer result = userMapper.deleteUserById(id);
        return ResultUtils.success(result);
    }

    @Override
    public BaseResponse<User> queryOneUser(UserQuery userQuery) {
        User user = userMapper.queryOneUser(userQuery);
        if (user == null) {
            return ResultUtils.error(ErrorCode.FAIL, "该用户不存在");
        }
        return ResultUtils.success(user);
    }
}
