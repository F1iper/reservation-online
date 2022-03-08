package com.kamann.productCategory.domain.service;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;

public interface ProductCategoryUpdateService {

    ProductCategoryDto updateCategory(ProductCategoryDto dto, Long id);
}
