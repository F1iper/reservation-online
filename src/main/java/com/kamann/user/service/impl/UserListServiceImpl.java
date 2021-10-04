package com.kamann.user.service.impl;

import com.kamann.user.domain.User;
import com.kamann.user.dto.UserDto;
import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserListService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserListServiceImpl implements UserListService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<UserDto> mapUserToDto() {
        List<User> allUsers = userRepository.findAll();
        return allUsers
                .stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }
}
