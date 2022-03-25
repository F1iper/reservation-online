package com.reservationonline.Category.domain.service;

import com.reservationonline.Category.domain.dto.CategoryDto;

public interface CategoryUpdateService {

    boolean updateCategory(CategoryDto dto, Long id);
}
