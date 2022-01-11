package com.kamann.client.domain.service.client;

import com.kamann.client.domain.dto.ClientDto;

import java.util.List;

public interface ClientListService {

    List<ClientDto> getClientsAsList();
}
