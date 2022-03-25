package com.reservationonline.Category.domain.mapper.impl;

import com.reservationonline.Category.domain.dto.CategoryDto;
import com.reservationonline.Category.domain.entity.Category;
import com.reservationonline.Category.domain.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryMapperImpl implements CategoryMapper {

    private final ModelMapper modelMapper;

    @Override
    public Category productCategoryDtoToProductCategory(CategoryDto dto) {
        return modelMapper.map(dto, Category.class);
    }

    @Override
    public CategoryDto productCategoryToProductCategoryDto(Category category) {
        return modelMapper.map(category, CategoryDto.class);
    }
}
