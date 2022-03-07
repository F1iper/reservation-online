package com.kamann.productCategory.domain.service.impl;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;
import com.kamann.productCategory.domain.entity.ProductCategory;
import com.kamann.productCategory.domain.repository.ProductCategoryRepository;
import com.kamann.productCategory.domain.service.ProductCategoryAddService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryAddServiceImpl implements ProductCategoryAddService {

    private final ProductCategoryRepository repository;
    private final ModelMapper mapper;


    @Override
    public ProductCategoryDto add(ProductCategoryDto dto) {
        ProductCategory save = repository.save(mapper.map(dto, ProductCategory.class));
        return mapper.map(save, ProductCategoryDto.class);
    }
}
