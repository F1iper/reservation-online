package com.kamann.user.mapper;

import com.kamann.user.domain.User;
import com.kamann.user.dto.UserDto;

public interface UserMapper {

        User userDtoToUser(UserDto userDto);
        UserDto userToUserDto(User user);
        //todo: List<UserDto> UserListToUserDtoList(List<User>

        <B, R> R remapObjects(B base, R result);
}
