package com.reservationonline.client.domain.service.address;


import com.reservationonline.client.domain.dto.AddressDto;

import java.util.List;

public interface AddressListService {

    List<AddressDto> getAddressesAsList();
}
