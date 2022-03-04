package com.kamann.productCategory.domain.mapper.impl;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;
import com.kamann.productCategory.domain.entity.ProductCategory;
import com.kamann.productCategory.domain.mapper.ProductCategoryMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryMapperImpl implements ProductCategoryMapper {

    private final ModelMapper modelMapper;

    @Override
    public ProductCategory productCategoryDtoToProductCategory(ProductCategoryDto dto) {
        return modelMapper.map(dto, ProductCategory.class);
    }

    @Override
    public ProductCategoryDto productCategoryToProductCategoryDto(ProductCategory category) {
        return modelMapper.map(category, ProductCategoryDto.class);
    }
}
