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

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public List<ClientDto> getClientsAsList() {
        List<Client> allClients = clientRepository.findAll();
        return allClients
                .stream()
                .map(clientMapper::clientToClientDto)
                .collect(Collectors.toList());
    }
}
