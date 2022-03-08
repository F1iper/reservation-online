package com.reservationonline.client.domain.mapper;

import com.reservationonline.client.domain.dto.AddressDto;
import com.reservationonline.client.domain.entitty.Address;

import java.util.List;

public interface AddressMapper {

    Address addressDtoToAddress(AddressDto addressDto);

    AddressDto addressToAddressDto(Address address);

    List<Address> addressDtoListToAddressList(List<AddressDto> dtos);

    List<AddressDto> addressListToAddressDtoList(List<Address> addresses);
}
