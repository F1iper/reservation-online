package com.reservationonline.client.domain.mapper;

import com.reservationonline.client.domain.dto.ClientDto;
import com.reservationonline.client.domain.entity.Client;

public interface ClientMapper {

        Client ClientDtoToClient(ClientDto clientDto);
        ClientDto clientToClientDto(Client client);
//todo:   List<ClientDto> clientListToClientDtoList (List<Client> clients);
//        List<Client> clientDtoListToClientList (List<ClientDto> dtos);

}
