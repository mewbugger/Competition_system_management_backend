package com.wly.competition_system_management_backend.service;

import com.wly.competition_system_management_backend.common.BaseResponse;
import com.wly.competition_system_management_backend.model.domain.User;
import com.wly.competition_system_management_backend.model.query.UserQuery;

import java.util.List;

public interface UserService {

    public List<User> listAllUser();

    public BaseResponse<List<User>> listAllUserByPage(int pageNum, int pageSize);

    public BaseResponse<Integer> deleteUserById(Long id);

    public BaseResponse<User> queryOneUser(UserQuery userQuery);
}
