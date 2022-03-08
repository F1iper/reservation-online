package com.reservationonline.productCategory.domain.service;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;

public interface ProductCategoryGetByIdService {

    ProductCategoryDto getProductCategoryDtoById(Long id);

    boolean existsById(Long id);


}
