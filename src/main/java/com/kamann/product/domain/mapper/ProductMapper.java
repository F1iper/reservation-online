package com.kamann.product.domain.mapper;

import com.kamann.product.domain.entity.Product;
import com.kamann.product.domain.dto.ProductDto;

public interface ProductMapper {

    Product productDtoToProduct (ProductDto productDto);
    ProductDto productToProductDto (Product product);
}
