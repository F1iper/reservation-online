package com.kamann.client.mapper.impl;

import com.kamann.client.dto.ClientBaseDto;
import com.kamann.client.dto.ClientDto;
import com.kamann.client.entitiy.Client;
import com.kamann.client.mapper.ClientMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class ClientMapperImpl implements ClientMapper {

  @Override
  public Client clientBaseDtoToClient(ClientBaseDto clientBaseDto) {
    return Client.builder()
        .firstname(clientBaseDto.getFirstname())
        .lastname(clientBaseDto.getLastname())
        .phoneNumber(clientBaseDto.getPhoneNumber())
        .email(clientBaseDto.getEmail())
        .address(clientBaseDto.getAddress())
        .build();
  }

  @Override
  public ClientBaseDto clientToClientBaseDto(Client client) {
    return ClientBaseDto.builder()
        .firstname(client.getFirstname())
        .lastname(client.getLastname())
        .phoneNumber(client.getPhoneNumber())
        .email(client.getEmail())
        .address(client.getAddress())
        .build();
  }

  public List<ClientDto> clientToClientDto(Page<Client> listClient){
    List<ClientDto> listClientDto = new ArrayList<>();
    BeanUtils.copyProperties(listClientDto, listClient.getContent());
    return listClientDto;
  }
}
