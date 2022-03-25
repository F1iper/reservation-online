package com.reservationonline.service.domain.service.impl;

import com.reservationonline.service.domain.entity.Service;
import com.reservationonline.service.domain.dto.ServiceDto;
import com.reservationonline.service.domain.mapper.ServiceMapper;
import com.reservationonline.service.domain.repository.ServiceRepository;
import com.reservationonline.service.domain.service.ServiceGetById;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceGetByIdImplGetById implements ServiceGetById {

    private final ServiceRepository repository;
    private final ServiceMapper mapper;

    @Override
    public ServiceDto getProductById(Long id) {
        Service serviceById = repository.getOne(id);
        return mapper.productToProductDto(serviceById);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
