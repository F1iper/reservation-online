package com.reservationonline.productCategory.domain.service.impl;

import com.reservationonline.productCategory.domain.repository.ProductCategoryRepository;
import com.reservationonline.productCategory.domain.service.ProductCategoryDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryDeleteServiceImpl implements ProductCategoryDeleteService {

    private final ProductCategoryRepository repository;

    @Override
    public boolean productCategoryListIsEmpty() {
        if(repository.findAll().isEmpty())
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
