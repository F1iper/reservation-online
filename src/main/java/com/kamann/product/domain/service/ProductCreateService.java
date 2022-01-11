package com.kamann.product.domain.service;

import com.kamann.product.domain.dto.ProductDto;

public interface ProductCreateService {

    ProductDto execute(ProductDto productDto);
}
