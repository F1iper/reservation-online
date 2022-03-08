package com.reservationonline.client.domain.service.address;

import com.reservationonline.client.domain.dto.AddressDto;

public interface AddressGetByIdService {

    AddressDto getById(Long id);
}
