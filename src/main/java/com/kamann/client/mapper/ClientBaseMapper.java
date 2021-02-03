package com.kamann.client.mapper;

import com.kamann.client.dto.ClientBaseDto;
import com.kamann.client.entitiy.Client;

public interface ClientBaseMapper {

  Client clientBaseDtoToClient(ClientBaseDto clientBaseDto);
  ClientBaseDto clientToClientBaseDto(Client client);
//  List<ClientDto> clientToDto(Page<Client> listClient);
  //todo: implement pagination

  <B, R> R remapObjects(B base, R result);
}
