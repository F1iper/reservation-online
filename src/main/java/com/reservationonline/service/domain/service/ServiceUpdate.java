package com.reservationonline.service.domain.service;

import com.reservationonline.service.domain.dto.ServiceDto;

public interface ServiceUpdate {

    ServiceDto update(ServiceDto dto, Long id);

    boolean ifExists(Long id);
}
