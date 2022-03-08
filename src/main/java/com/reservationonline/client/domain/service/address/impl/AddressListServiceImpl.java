package com.reservationonline.client.domain.service.address.impl;

import com.reservationonline.client.domain.dto.AddressDto;
import com.reservationonline.client.domain.mapper.AddressMapper;
import com.reservationonline.client.domain.repository.AddressRepository;
import com.reservationonline.client.domain.service.address.AddressListService;
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
