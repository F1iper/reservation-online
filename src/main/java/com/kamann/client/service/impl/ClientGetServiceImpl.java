package com.kamann.client.service.impl;

import com.kamann.client.dto.ClientDto;
import com.kamann.client.mapper.ClientMapper;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientGetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientGetServiceImpl implements ClientGetService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public ClientDto getClientById(Long id) {
        return clientMapper.clientToClientDto(clientRepository.getOne(id));
    }
}
