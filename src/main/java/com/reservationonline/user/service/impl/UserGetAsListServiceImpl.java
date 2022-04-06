package com.reservationonline.user.service.impl;

import com.reservationonline.user.dto.UserDto;
import com.reservationonline.user.repository.UserRepository;
import com.reservationonline.user.service.UserGetAsListService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserGetAsListServiceImpl implements UserGetAsListService {

    private final UserRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<UserDto> listOfUsers() {
        List<UserDto> mappedList = new LinkedList<>();
        mapper.map(repository.findAll(), mappedList);
        return mappedList;
    }
}
