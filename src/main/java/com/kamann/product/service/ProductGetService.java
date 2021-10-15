package com.kamann.product.service;

import com.kamann.product.dto.ProductDto;

public interface ProductGetService {

    ProductDto getProductById(Long id);

}
