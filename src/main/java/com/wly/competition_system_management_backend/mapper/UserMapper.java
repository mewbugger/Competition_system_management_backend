package com.wly.competition_system_management_backend.mapper;

import com.wly.competition_system_management_backend.model.domain.User;
import com.wly.competition_system_management_backend.model.query.UserQuery;
import com.wly.competition_system_management_backend.model.request.UserUpdateRequest;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {

    List<User> listAllUser();

    Integer deleteUserById(Long id);

    User queryOneUser(UserQuery userQuery);

    Integer updateUserById(UserUpdateRequest userUpdateRequest);
}
