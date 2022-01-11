package com.kamann.client.domain.service.client;

import com.kamann.client.domain.dto.ClientDto;

public interface ClientCreateService {

    ClientDto execute(ClientDto clientDto);
}
