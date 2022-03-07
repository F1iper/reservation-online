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

    private final ClientRepository repository;
    private final ClientMapper mapper;

    @Override
    public ClientDto getClientById(Long id) {
        return mapper.clientToClientDto(repository.getOne(id));
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
