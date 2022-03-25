package com.reservationonline.client.domain.mapper.impl;

import com.reservationonline.client.domain.dto.AddressDto;
import com.reservationonline.client.domain.entity.Address;
import com.reservationonline.client.domain.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressMapperImpl implements AddressMapper {

    private final ModelMapper modelMapper;

    @Override
    public Address addressDtoToAddress(AddressDto addressDto) {
        return modelMapper.map(addressDto, Address.class);
    }

    @Override
    public List<Address> addressDtoListToAddressList(List<AddressDto> dtos) {
        List<Address> addresses = new ArrayList<>();
        modelMapper.map(dtos, addresses);
        return addresses;
    }

    @Override
    public List<AddressDto> addressListToAddressDtoList(List<Address> addresses) {
        List<AddressDto> dtos = new ArrayList<>();
        modelMapper.map(addresses, dtos);
        return dtos;
    }

    @Override
    public AddressDto addressToAddressDto(Address address) {
        return modelMapper.map(address, AddressDto.class);
    }
}
