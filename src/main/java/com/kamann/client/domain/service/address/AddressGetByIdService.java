package com.kamann.client.domain.service.address;

import com.kamann.client.domain.dto.AddressDto;

public interface AddressGetByIdService {

    AddressDto getById(Long id);
}
