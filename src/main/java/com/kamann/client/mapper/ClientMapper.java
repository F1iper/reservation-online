package com.kamann.client.mapper;

import com.kamann.client.domain.Client;
import com.kamann.client.dto.ClientDto;

public interface ClientMapper {

        Client ClientDtoToClient(ClientDto clientDto);
        ClientDto clientToClientDto(Client client);
        //todo: List<ClientDto> ClientListToClientDtoList(List<Client>

}
