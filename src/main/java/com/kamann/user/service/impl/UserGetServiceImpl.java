package com.kamann.user.service.impl;

import com.kamann.user.domain.User;
import com.kamann.user.dto.UserDto;
import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserGetService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserGetServiceImpl implements UserGetService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserDto getUserById(Long id) {
        User userFromDB = modelMapper.map(userRepository.findById(id), User.class);
        return modelMapper.map(userFromDB, UserDto.class);
    }
}
