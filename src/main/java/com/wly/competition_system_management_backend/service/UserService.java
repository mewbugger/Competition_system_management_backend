package com.wly.competition_system_management_backend.service;

import com.wly.competition_system_management_backend.model.domain.User;
import com.wly.competition_system_management_backend.model.query.UserQuery;
import com.wly.competition_system_management_backend.model.request.UserUpdateRequest;

import java.util.List;

public interface UserService {

    public List<User> listAllUser();

    public List<User> listAllUserByPage(int pageNum, int pageSize);

    public Integer deleteUserById(Long id);

    public User queryOneUser(UserQuery userQuery);

    public Integer updateUserById(UserUpdateRequest userUpdateRequest);
}
