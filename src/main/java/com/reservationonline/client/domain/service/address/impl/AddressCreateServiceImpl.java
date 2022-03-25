package com.reservationonline.client.domain.service.address.impl;

import com.reservationonline.client.domain.dto.AddressDto;
import com.reservationonline.client.domain.entity.Address;
import com.reservationonline.client.domain.mapper.AddressMapper;
import com.reservationonline.client.domain.repository.AddressRepository;
import com.reservationonline.client.domain.service.address.AddressCreateService;
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
