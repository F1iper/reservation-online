package com.reservationonline.category.domain.service;

import com.reservationonline.category.domain.dto.CategoryDto;

public interface CategoryGetByIdService {

    CategoryDto getProductCategoryDtoById(Long id);

    boolean existsById(Long id);


}
