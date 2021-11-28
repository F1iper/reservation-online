package com.kamann.product.service;

import com.kamann.product.dto.ProductDto;

public interface ProductGetByIdService {

    ProductDto getProductById(Long id);

}
