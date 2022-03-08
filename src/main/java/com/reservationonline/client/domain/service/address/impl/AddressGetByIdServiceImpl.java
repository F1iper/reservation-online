package com.reservationonline.client.domain.service.address.impl;

import com.reservationonline.client.domain.dto.AddressDto;
import com.reservationonline.client.domain.mapper.AddressMapper;
import com.reservationonline.client.domain.repository.AddressRepository;
import com.reservationonline.client.domain.service.address.AddressGetByIdService;
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
