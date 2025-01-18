package com.sebi.service.user;

import com.sebi.dto.UserDto;
import com.sebi.model.User;
import com.sebi.request.CreateUserRequest;
import com.sebi.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
