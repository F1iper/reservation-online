package com.kamann.client.domain.service.client.impl;

import com.kamann.client.domain.entitty.Client;
import com.kamann.client.domain.dto.ClientDto;
import com.kamann.client.domain.mapper.ClientMapper;
import com.kamann.client.domain.repository.ClientRepository;
import com.kamann.client.domain.service.client.ClientListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientListServiceImpl implements ClientListService {

    private final ClientRepository repository;
    private final ClientMapper mapper;

    @Override
    public List<ClientDto> getClientsAsList() {
        List<Client> allClients = repository.findAll();
        return allClients
                .stream()
                .map(mapper::clientToClientDto)
                .collect(Collectors.toList());
    }
}
