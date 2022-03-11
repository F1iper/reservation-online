package com.reservationonline.productCategory.domain.service;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;

public interface ProductCategoryUpdateService {

    boolean updateCategory(ProductCategoryDto dto, Long id);
}
