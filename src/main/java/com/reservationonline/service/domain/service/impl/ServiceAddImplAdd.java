package com.reservationonline.service.domain.service.impl;

import com.reservationonline.service.domain.dto.ServiceDto;
import com.reservationonline.service.domain.entity.Service;
import com.reservationonline.service.domain.mapper.ServiceMapper;
import com.reservationonline.service.domain.repository.ServiceRepository;
import com.reservationonline.service.domain.service.ServiceAdd;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceAddImplAdd implements ServiceAdd {

    private final ServiceRepository repository;
    private final ServiceMapper mapper;

    @Override
    public ServiceDto add(ServiceDto serviceDto) {
        Service savedService = repository.save(mapper.productDtoToProduct(serviceDto));
        return mapper.productToProductDto(savedService);
    }
}
