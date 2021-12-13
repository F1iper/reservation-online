package com.kamann.client.service.impl;

import com.kamann.client.domain.User;
import com.kamann.client.dto.ClientDto;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientGetService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientGetServiceImpl implements ClientGetService {

    private final ClientRepository clientRepository;
    private final ModelMapper modelMapper;

    @Override
    public ClientDto getUserById(Long id) {
        User userFromDB = modelMapper.map(clientRepository.getOne(id), User.class);
        return modelMapper.map(userFromDB, ClientDto.class);
    }
}
