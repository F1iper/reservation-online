package com.kamann.productCategory.domain.service;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;

public interface ProductCategoryGetByIdService {

    ProductCategoryDto getProductCategoryDtoById(Long id);


}
