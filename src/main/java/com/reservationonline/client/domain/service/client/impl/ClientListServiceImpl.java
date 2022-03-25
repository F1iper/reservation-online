package com.reservationonline.client.domain.service.client.impl;

import com.reservationonline.client.domain.entity.Client;
import com.reservationonline.client.domain.dto.ClientDto;
import com.reservationonline.client.domain.mapper.ClientMapper;
import com.reservationonline.client.domain.repository.ClientRepository;
import com.reservationonline.client.domain.service.client.ClientListService;
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
