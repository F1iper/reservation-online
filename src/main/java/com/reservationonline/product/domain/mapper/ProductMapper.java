package com.reservationonline.product.domain.mapper;

import com.reservationonline.product.domain.entity.Product;
import com.reservationonline.product.domain.dto.ProductDto;

public interface ProductMapper {

    Product productDtoToProduct (ProductDto productDto);
    ProductDto productToProductDto (Product product);
}
