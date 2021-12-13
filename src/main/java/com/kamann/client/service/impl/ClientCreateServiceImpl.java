package com.kamann.client.service.impl;

import com.kamann.client.domain.Client;
import com.kamann.client.dto.ClientDto;
import com.kamann.client.mapper.ClientMapper;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientCreateServiceImpl implements ClientCreateService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    private final BCryptPasswordEncoder encoder;


    @Override
    public ClientDto execute(ClientDto clientDto) {
        clientDto.setPassword(encoder.encode(clientDto.getPassword()));
        Client beforeSaveClient = clientMapper.ClientDtoToClient(clientDto);
        Client savedClient = clientRepository.save(beforeSaveClient);
        return clientMapper.clientToClientDto(savedClient);
    }
}
