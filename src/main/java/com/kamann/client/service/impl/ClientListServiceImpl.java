package com.kamann.client.service.impl;

import com.kamann.client.domain.User;
import com.kamann.client.dto.ClientDto;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientListService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientListServiceImpl implements ClientListService {

    private final ClientRepository clientRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ClientDto> getUsersAsList() {
        List<User> allUsers = clientRepository.findAll();
        return allUsers
                .stream()
                .map(user -> modelMapper.map(user, ClientDto.class))
                .collect(Collectors.toList());
    }
}
