package com.reservationonline.product.domain.service;

import com.reservationonline.product.domain.dto.ProductDto;

import java.util.List;

public interface ProductListService {

    List<ProductDto> getProductsAsList();
}
