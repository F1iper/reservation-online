package com.kamann.client.service.impl;

import com.kamann.client.domain.Client;
import com.kamann.client.dto.ClientDto;
import com.kamann.client.mapper.ClientMapper;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientListService;
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
