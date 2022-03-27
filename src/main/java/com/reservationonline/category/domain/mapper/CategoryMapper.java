package com.reservationonline.category.domain.mapper;

import com.reservationonline.category.domain.dto.CategoryDto;
import com.reservationonline.category.domain.entity.Category;

public interface CategoryMapper {

    Category productCategoryDtoToProductCategory(CategoryDto categoryDto);

    CategoryDto productCategoryToProductCategoryDto(Category category);
}
