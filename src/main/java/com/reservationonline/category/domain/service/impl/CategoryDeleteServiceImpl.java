package com.reservationonline.category.domain.service.impl;

import com.reservationonline.category.domain.repository.CategoryRepository;
import com.reservationonline.category.domain.service.CategoryDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryDeleteServiceImpl implements CategoryDeleteService {

    private final CategoryRepository repository;

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
