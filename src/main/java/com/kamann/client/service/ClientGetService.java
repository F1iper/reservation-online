package com.kamann.client.service;

import com.kamann.client.dto.ClientDto;

public interface ClientGetService {

    ClientDto getClientById(Long id);
}
