package com.kamann.product.domain.service;

import com.kamann.product.domain.dto.ProductDto;

public interface ProductGetByIdService {

    ProductDto getProductById(Long id);

}
