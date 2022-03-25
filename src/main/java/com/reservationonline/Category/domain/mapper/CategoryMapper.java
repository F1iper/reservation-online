package com.reservationonline.Category.domain.mapper;

import com.reservationonline.Category.domain.dto.CategoryDto;
import com.reservationonline.Category.domain.entity.Category;

public interface CategoryMapper {

    Category productCategoryDtoToProductCategory(CategoryDto categoryDto);

    CategoryDto productCategoryToProductCategoryDto(Category category);
}
