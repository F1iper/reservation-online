package com.kamann.client.domain.service.client;

import com.kamann.client.domain.dto.ClientDto;

public interface ClientGetByIdService {

    ClientDto getById(Long id);
}
