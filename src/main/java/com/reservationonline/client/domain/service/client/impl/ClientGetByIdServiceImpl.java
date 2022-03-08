package com.reservationonline.client.domain.service.client.impl;

import com.reservationonline.client.domain.dto.ClientDto;
import com.reservationonline.client.domain.mapper.ClientMapper;
import com.reservationonline.client.domain.repository.ClientRepository;
import com.reservationonline.client.domain.service.client.ClientGetByIdService;
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
