package com.reservationonline.service.domain.mapper;

import com.reservationonline.service.domain.entity.Service;
import com.reservationonline.service.domain.dto.ServiceDto;

public interface ServiceMapper {

    Service productDtoToProduct (ServiceDto serviceDto);
    ServiceDto productToProductDto (Service service);
}
