package com.reservationonline.Category.domain.service;

import com.reservationonline.Category.domain.dto.CategoryDto;

public interface CategoryGetByIdService {

    CategoryDto getProductCategoryDtoById(Long id);

    boolean existsById(Long id);


}
