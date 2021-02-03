package com.kamann.client.mapper;

import com.kamann.client.dto.ClientBaseDto;
import com.kamann.client.entitiy.Client;

public interface ClientMapper {

  Client clientBaseDtoToClient (ClientBaseDto clientBaseDto);
  ClientBaseDto clientToClientBaseDto(Client client);
//  List<ClientDto> clientToDto(Page<Client> listClient);
//todo: implement pagination
}
