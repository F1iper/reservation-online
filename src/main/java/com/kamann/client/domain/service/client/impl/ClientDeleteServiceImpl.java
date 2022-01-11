package com.kamann.client.domain.service.client.impl;

import com.kamann.client.domain.repository.ClientRepository;
import com.kamann.client.domain.service.client.ClientDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientDeleteServiceImpl implements ClientDeleteService {

    private final ClientRepository clientRepository;

    @Override
    public boolean delete(Long id) {
        return clientRepository.existsById(id);
    }
}
