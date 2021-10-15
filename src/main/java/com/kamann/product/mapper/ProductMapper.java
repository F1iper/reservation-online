package com.kamann.product.mapper;

import com.kamann.product.domain.Product;
import com.kamann.product.dto.ProductDto;

public interface ProductMapper {

    Product productDtoToProduct (ProductDto productDto);
    ProductDto productToProductDto (Product product);
}
