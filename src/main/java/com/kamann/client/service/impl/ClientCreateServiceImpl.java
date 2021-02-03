package com.kamann.client.service.impl;

import com.kamann.client.dto.ClientBaseDto;
import com.kamann.client.entitiy.Client;
import com.kamann.client.mapper.ClientMapper;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientCreateServiceImpl implements ClientCreateService {

  private final ClientRepository clientRepository;
  private final ClientMapper clientMapper;

  @Override
  public ClientBaseDto save(ClientBaseDto clientBaseDto) {
    Client client = clientMapper.clientBaseDtoToClient(clientBaseDto);
    Client save = clientRepository.save(client);
    return clientMapper.clientToClientBaseDto(save);
  }
}
