package com.reservationonline.productCategory.domain.service.impl;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;
import com.reservationonline.productCategory.domain.entity.ProductCategory;
import com.reservationonline.productCategory.domain.repository.ProductCategoryRepository;
import com.reservationonline.productCategory.domain.service.ProductCategoryAddService;
import com.reservationonline.productCategory.domain.service.ProductCategoryUpdateService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryUpdateServiceImpl implements ProductCategoryUpdateService {

    private final ProductCategoryRepository repository;
    private final ProductCategoryAddService addService;
    private final ModelMapper mapper;

    @Override
    public ProductCategoryDto updateCategory(ProductCategoryDto dto, Long id) {
        if (!repository.existsById(id))
            return addService.add(dto);
        else {
            ProductCategory savedCategory = repository.save(mapper.map(dto, ProductCategory.class));
            return mapper.map(savedCategory, ProductCategoryDto.class);
        }
    }
}
