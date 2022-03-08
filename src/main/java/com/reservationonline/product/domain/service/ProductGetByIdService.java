package com.reservationonline.product.domain.service;

import com.reservationonline.product.domain.dto.ProductDto;

public interface ProductGetByIdService {

    ProductDto getProductById(Long id);

    boolean existsById(Long id);
}
