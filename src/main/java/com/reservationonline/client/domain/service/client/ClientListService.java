package com.reservationonline.client.domain.service.client;

import com.reservationonline.client.domain.dto.ClientDto;

import java.util.List;

public interface ClientListService {

    List<ClientDto> getClientsAsList();
}
