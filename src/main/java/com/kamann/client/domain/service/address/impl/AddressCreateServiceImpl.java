package com.kamann.client.domain.service.address.impl;

import com.kamann.client.domain.dto.AddressDto;
import com.kamann.client.domain.entitty.Address;
import com.kamann.client.domain.mapper.AddressMapper;
import com.kamann.client.domain.repository.AddressRepository;
import com.kamann.client.domain.service.address.AddressCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressCreateServiceImpl implements AddressCreateService {

    private final AddressRepository repository;
    private final AddressMapper mapper;

    @Override
    public AddressDto execute(AddressDto addressDto) {
        Address savedAddress = repository.save(mapper.addressDtoToAddress(addressDto));
        return mapper.addressToAddressDto(savedAddress);
    }
}
