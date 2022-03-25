package com.reservationonline.service.domain.service.impl;

import com.reservationonline.service.domain.dto.ServiceDto;
import com.reservationonline.service.domain.entity.Service;
import com.reservationonline.service.domain.repository.ServiceRepository;
import com.reservationonline.service.domain.service.ServiceUpdate;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceUpdateImplUpdate implements ServiceUpdate {

    private final ServiceRepository repository;
    private final ModelMapper mapper;


    @Override
    public ServiceDto update(ServiceDto dto, Long id) {
        Service serviceFromDb = repository.getOne(id);
        mapper.map(dto, serviceFromDb);
        return mapper.map(serviceFromDb, ServiceDto.class);
    }

    @Override
    public boolean ifExists(Long id) {
        return repository.existsById(id);
    }
}
