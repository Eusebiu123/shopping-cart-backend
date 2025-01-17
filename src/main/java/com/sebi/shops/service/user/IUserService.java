package com.sebi.shops.service.user;

import com.sebi.shops.model.User;
import com.sebi.shops.request.CreateUserRequest;
import com.sebi.shops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
}
