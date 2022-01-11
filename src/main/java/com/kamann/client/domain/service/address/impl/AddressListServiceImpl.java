package com.kamann.client.domain.service.address.impl;

import com.kamann.client.domain.dto.AddressDto;
import com.kamann.client.domain.mapper.AddressMapper;
import com.kamann.client.domain.repository.AddressRepository;
import com.kamann.client.domain.service.address.AddressListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressListServiceImpl implements AddressListService {

    private final AddressRepository repository;
    private final AddressMapper mapper;

    @Override
    public List<AddressDto> getAddressesAsList() {
        return mapper.addressListToAddressDtoList(repository.findAll());
    }
}
