package com.kamann.client.domain.mapper;

import com.kamann.client.domain.dto.ClientDto;
import com.kamann.client.domain.entitty.Client;

import java.util.List;

public interface ClientMapper {

        Client ClientDtoToClient(ClientDto clientDto);
        ClientDto clientToClientDto(Client client);
//todo:   List<ClientDto> clientListToClientDtoList (List<Client> clients);
//        List<Client> clientDtoListToClientList (List<ClientDto> dtos);

}
