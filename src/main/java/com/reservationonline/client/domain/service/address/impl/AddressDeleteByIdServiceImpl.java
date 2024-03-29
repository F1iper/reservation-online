package com.reservationonline.client.domain.service.address.impl;

import com.reservationonline.client.domain.repository.AddressRepository;
import com.reservationonline.client.domain.service.address.AddressDeleteByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressDeleteByIdServiceImpl implements AddressDeleteByIdService {

    private final AddressRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
