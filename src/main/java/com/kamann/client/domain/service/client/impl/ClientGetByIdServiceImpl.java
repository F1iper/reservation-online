package com.kamann.client.domain.service.client.impl;

import com.kamann.client.domain.dto.ClientDto;
import com.kamann.client.domain.mapper.ClientMapper;
import com.kamann.client.domain.repository.ClientRepository;
import com.kamann.client.domain.service.client.ClientGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientGetByIdServiceImpl implements ClientGetByIdService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public ClientDto getById(Long id) {
        return clientMapper.clientToClientDto(clientRepository.getOne(id));
    }
}
