package com.kamann.productCategory.domain.service.impl;

import com.kamann.productCategory.domain.repository.ProductCategoryRepository;
import com.kamann.productCategory.domain.service.ProductCategoryRemoveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryRemoveServiceImpl implements ProductCategoryRemoveService {

    private final ProductCategoryRepository repository;

    @Override
    public boolean removeIfIdExists(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else
            return false;
    }
}
