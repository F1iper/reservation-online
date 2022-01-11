package com.kamann.client.domain.service.address.impl;

import com.kamann.client.domain.dto.AddressDto;
import com.kamann.client.domain.mapper.AddressMapper;
import com.kamann.client.domain.repository.AddressRepository;
import com.kamann.client.domain.service.address.AddressGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressGetByIdServiceImpl implements AddressGetByIdService {

    private final AddressRepository repository;
    private final AddressMapper mapper;

    @Override
    public AddressDto getById(Long id) {
        return mapper.addressToAddressDto(repository.getOne(id));
    }
}
