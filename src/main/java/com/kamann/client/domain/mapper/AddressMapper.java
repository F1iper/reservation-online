package com.kamann.client.domain.mapper;

import com.kamann.client.domain.dto.AddressDto;
import com.kamann.client.domain.entitty.Address;

import java.util.List;

public interface AddressMapper {

    Address addressDtoToAddress(AddressDto addressDto);

    AddressDto addressToAddressDto(Address address);

    List<Address> addressDtoListToAddressList(List<AddressDto> dtos);

    List<AddressDto> addressListToAddressDtoList(List<Address> addresses);
}
