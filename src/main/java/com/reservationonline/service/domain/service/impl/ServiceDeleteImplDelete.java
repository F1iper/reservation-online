package com.reservationonline.service.domain.service.impl;

import com.reservationonline.service.domain.repository.ServiceRepository;
import com.reservationonline.service.domain.service.ServiceDelete;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceDeleteImplDelete implements ServiceDelete {

    private final ServiceRepository repository;

    @Override
    public boolean productListIsEmpty() {
        if (repository.findAll().isEmpty())
            return true;
        else {
            repository.deleteAll();
            return false;
        }
    }

    @Override
    public boolean deleteIfIdExists(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else
            return false;
    }
}
