package com.reservationonline.service.domain.service.impl;

import com.reservationonline.service.domain.entity.Service;
import com.reservationonline.service.domain.dto.ServiceDto;
import com.reservationonline.service.domain.repository.ServiceRepository;
import com.reservationonline.service.domain.service.ServiceList;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceListImplList implements ServiceList {

    private final ServiceRepository serviceRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ServiceDto> getProductsAsList() {
        List<Service> serviceList = serviceRepository.findAll();
        return serviceList.
                stream()
                .map(product -> modelMapper.map(product, ServiceDto.class))
                .collect(Collectors.toList());
    }
}
