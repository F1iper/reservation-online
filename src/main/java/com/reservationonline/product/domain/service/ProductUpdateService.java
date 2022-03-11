package com.reservationonline.product.domain.service;

import com.reservationonline.product.domain.dto.ProductDto;

public interface ProductUpdateService {

    ProductDto update(ProductDto dto, Long id);

    boolean ifExists(Long id);
}
