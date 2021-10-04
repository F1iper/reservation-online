package com.kamann.user.service;

import com.kamann.user.dto.UserDto;

public interface UserGetService {

    UserDto getUserById(Long id);
}
