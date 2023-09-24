package com.wly.competition_system_management_backend.service.impl;

import com.github.pagehelper.PageHelper;
import com.wly.competition_system_management_backend.common.ErrorCode;
import com.wly.competition_system_management_backend.exception.BusinessException;
import com.wly.competition_system_management_backend.mapper.UserMapper;
import com.wly.competition_system_management_backend.model.domain.User;
import com.wly.competition_system_management_backend.model.query.UserQuery;
import com.wly.competition_system_management_backend.model.request.UserUpdateRequest;
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
    public List<User> listAllUserByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.listAllUser();
        if (users == null) {
            throw new BusinessException(ErrorCode.FAIL, "查询的用户列表不存在");
        }
        return users;
    }

    @Override
    public Integer deleteUserById(Long id) {
        Integer result = userMapper.deleteUserById(id);
        if (result == 0) {
            throw new BusinessException(ErrorCode.FAIL, "需要删除的用户不存在");
        }
        return result;
    }

    @Override
    public User queryOneUser(UserQuery userQuery) {
        User user = userMapper.queryOneUser(userQuery);
        if (user == null) {
            throw new BusinessException(ErrorCode.FAIL, "查询的用户不存在");
        }
        return user;
    }

    @Override
    public Integer updateUserById(UserUpdateRequest userUpdateRequest) {
        Integer result = userMapper.updateUserById(userUpdateRequest);
        if (result == 0) {
            throw new BusinessException(ErrorCode.FAIL, "需要修改的用户不存在");
        }
        return result;
    }
}
