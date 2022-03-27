package com.reservationonline.category.domain.service;

import com.reservationonline.category.domain.dto.CategoryDto;

public interface CategoryUpdateService {

    boolean updateCategory(CategoryDto dto, Long id);
}
