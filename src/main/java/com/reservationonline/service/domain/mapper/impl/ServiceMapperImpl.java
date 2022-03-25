package com.reservationonline.service.domain.mapper.impl;

import com.reservationonline.service.domain.entity.Service;
import com.reservationonline.service.domain.dto.ServiceDto;
import com.reservationonline.service.domain.mapper.ServiceMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceMapperImpl implements ServiceMapper {

    private final ModelMapper modelMapper;

    @Override
    public Service productDtoToProduct(ServiceDto serviceDto) {
        return modelMapper.map(serviceDto, Service.class);
    }

    @Override
    public ServiceDto productToProductDto(Service service) {
        return modelMapper.map(service, ServiceDto.class);
    }
}
