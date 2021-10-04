package com.kamann.user.service.impl;

import com.kamann.user.domain.User;
import com.kamann.user.dto.UserDto;
import com.kamann.user.mapper.UserMapper;
import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserCreateServiceImpl implements UserCreateService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final BCryptPasswordEncoder encoder;


    @Override
    public UserDto execute(UserDto userDto) {
        userDto.setPassword(encoder.encode(userDto.getPassword()));
        User beforeSaveUser = userMapper.userDtoToUser(userDto);
        User savedUser = userRepository.save(beforeSaveUser);
        return userMapper.userToUserDto(savedUser);
    }
}
