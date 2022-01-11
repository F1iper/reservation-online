package com.kamann.product.domain.service;

import com.kamann.product.domain.dto.ProductDto;

import java.util.List;

public interface ProductListService {

    List<ProductDto> getProductsAsList();
}
