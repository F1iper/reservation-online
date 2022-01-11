package com.kamann.client.domain.service.address;


import com.kamann.client.domain.dto.AddressDto;

import java.util.List;

public interface AddressListService {

    List<AddressDto> getAddressesAsList();
}
