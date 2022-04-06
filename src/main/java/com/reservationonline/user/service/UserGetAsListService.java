package com.reservationonline.user.service;

import com.reservationonline.user.dto.UserDto;

import java.util.List;

public interface UserGetAsListService {

    List<UserDto> listOfUsers();
}
