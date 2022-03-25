package com.reservationonline.service.domain.service;

import com.reservationonline.service.domain.dto.ServiceDto;

public interface ServiceGetById {

    ServiceDto getProductById(Long id);

    boolean existsById(Long id);
}
