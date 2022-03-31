package com.reservationonline.user.service;

import com.reservationonline.user.entity.dto.UserDto;

import java.util.List;

public interface UserGetAsListService {

    List<UserDto> listOfUsers();
}
