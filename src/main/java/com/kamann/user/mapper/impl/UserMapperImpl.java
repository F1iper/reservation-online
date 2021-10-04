package com.kamann.user.mapper.impl;

import com.kamann.user.domain.User;
import com.kamann.user.dto.UserDto;
import com.kamann.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserMapperImpl implements UserMapper {

    private final ModelMapper modelMapper;

    @Override
    public User userDtoToUser(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    @Override
    public UserDto userToUserDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }
}
