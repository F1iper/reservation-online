package com.kamann.user.mapper.impl;

import com.kamann.user.domain.User;
import com.kamann.user.dto.UserDto;
import com.kamann.user.mapper.UserMapper;

public class UserMapperImpl implements UserMapper {
    @Override
    public User userDtoToUser(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .pesel(userDto.getPesel())
                .firstName(userDto.getName())
                .lastname(userDto.getLastname())
                .address(userDto.getAddress())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
    }

    @Override
    public UserDto userToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .pesel(user.getPesel())
                .name(user.getFirstName())
                .lastname(user.getLastname())
                .address(user.getAddress())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    @Override
    public <B, R> R remapObjects(B base, R result) {
        return result;
    }
}
