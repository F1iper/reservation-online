package com.kamann.client.domain.service.client.impl;

import com.kamann.client.domain.entitty.Client;
import com.kamann.client.domain.dto.ClientDto;
import com.kamann.client.domain.mapper.ClientMapper;
import com.kamann.client.domain.repository.ClientRepository;
import com.kamann.client.domain.service.client.ClientAddService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientAddServiceImpl implements ClientAddService {

    private final ClientRepository repository;
    private final ClientMapper mapper;
    private final BCryptPasswordEncoder encoder;

    @Override
    public ClientDto add(ClientDto clientDto) {
        clientDto.setPassword(encoder.encode(clientDto.getPassword()));
        Client savedClient = repository.save(mapper.ClientDtoToClient(clientDto));
        return mapper.clientToClientDto(savedClient);
    }
}
