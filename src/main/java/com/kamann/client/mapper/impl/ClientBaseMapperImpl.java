package com.kamann.client.mapper.impl;

import com.kamann.client.dto.ClientBaseDto;
import com.kamann.client.entitiy.Client;
import com.kamann.client.mapper.ClientBaseMapper;

public class ClientBaseMapperImpl implements ClientBaseMapper {

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

  @Override
  public <B, R> R remapObjects(B base, R result) {
    return result;
  }
}
