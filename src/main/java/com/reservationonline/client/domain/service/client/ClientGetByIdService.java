package com.reservationonline.client.domain.service.client;

import com.reservationonline.client.domain.dto.ClientDto;

public interface ClientGetByIdService {

    ClientDto getClientById(Long id);

    boolean existsById(Long id);
}
