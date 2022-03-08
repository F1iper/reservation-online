package com.reservationonline.product.domain.service.impl;

import com.reservationonline.product.domain.repository.ProductRepository;
import com.reservationonline.product.domain.service.ProductDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDeleteServiceImpl implements ProductDeleteService {

    private final ProductRepository repository;

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
