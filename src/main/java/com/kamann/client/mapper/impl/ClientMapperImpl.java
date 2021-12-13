package com.kamann.client.mapper.impl;

import com.kamann.client.domain.User;
import com.kamann.client.dto.ClientDto;
import com.kamann.client.mapper.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientMapperImpl implements ClientMapper {

    private final ModelMapper modelMapper;

    @Override
    public User userDtoToUser(ClientDto clientDto) {
        return modelMapper.map(clientDto, User.class);
    }

    @Override
    public ClientDto userToUserDto(User user) {
        return modelMapper.map(user, ClientDto.class);
    }
}
