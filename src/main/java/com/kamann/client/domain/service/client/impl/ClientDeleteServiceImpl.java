package com.kamann.client.domain.service.client.impl;

import com.kamann.client.domain.repository.ClientRepository;
import com.kamann.client.domain.service.client.ClientDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientDeleteServiceImpl implements ClientDeleteService {

    private final ClientRepository repository;

    @Override
    public boolean clientListIsEmpty() {
        if (repository.findAll().isEmpty())
            return true;
        else {
            repository.deleteAll();
            return false;
        }
    }

    @Override
    public boolean deleteIfIdExists(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else
            return false;
    }

}
