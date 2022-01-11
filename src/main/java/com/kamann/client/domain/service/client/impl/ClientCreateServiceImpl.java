package com.kamann.client.domain.service.client.impl;

import com.kamann.client.domain.entitty.Client;
import com.kamann.client.domain.dto.ClientDto;
import com.kamann.client.domain.mapper.ClientMapper;
import com.kamann.client.domain.repository.ClientRepository;
import com.kamann.client.domain.service.client.ClientCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientCreateServiceImpl implements ClientCreateService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    private final BCryptPasswordEncoder encoder;

    @Override
    public ClientDto execute(ClientDto clientDto) {
        clientDto.setPassword(encoder.encode(clientDto.getPassword()));
        Client savedClient = clientRepository.save(clientMapper.ClientDtoToClient(clientDto));
        return clientMapper.clientToClientDto(savedClient);
    }
}
