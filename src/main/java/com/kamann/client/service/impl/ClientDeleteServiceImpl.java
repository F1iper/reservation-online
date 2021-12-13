package com.kamann.client.service.impl;

import com.kamann.exception.ResourceNotFoundException;
import com.kamann.client.domain.Client;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientDeleteServiceImpl implements ClientDeleteService {

    private final ClientRepository clientRepository;

    @Override
    public boolean delete(Long id) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found: " + id));
        clientRepository.deleteById(client.getId());
        return !clientRepository.existsById(id);
    }
}
