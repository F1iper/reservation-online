package com.kamann.user.service;

import com.kamann.user.dto.UserDto;

import java.util.List;

public interface UserListService {

    List<UserDto> getUsersAsList();
}
