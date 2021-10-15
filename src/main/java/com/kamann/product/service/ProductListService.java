package com.kamann.product.service;

import com.kamann.product.dto.ProductDto;

import java.util.List;

public interface ProductListService {

    List<ProductDto> getProductsAsList();
}
