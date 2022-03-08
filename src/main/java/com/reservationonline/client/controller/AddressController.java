package com.reservationonline.client.controller;

import com.reservationonline.client.domain.dto.AddressDto;
import com.reservationonline.client.domain.service.address.AddressCreateService;
import com.reservationonline.client.domain.service.address.AddressDeleteByIdService;
import com.reservationonline.client.domain.service.address.AddressGetByIdService;
import com.reservationonline.client.domain.service.address.AddressListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressListService addressList;
    private final AddressGetByIdService addressGetById;
    private final AddressCreateService addressCreate;
    private final AddressDeleteByIdService addressDeleteById;

    @GetMapping
    public List<AddressDto> getAddress() {
        return addressList.getAddressesAsList();
    }

    @GetMapping("/{id}")
    public AddressDto getAddressById(@PathVariable Long id) {
        return addressGetById.getById(id);
    }

    @PostMapping
    public AddressDto createAddress(@RequestBody AddressDto addressDto) {
        return addressCreate.execute(addressDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressDeleteById.deleteById(id);
    }
}
