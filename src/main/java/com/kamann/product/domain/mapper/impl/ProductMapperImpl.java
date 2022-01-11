package com.kamann.product.domain.mapper.impl;

import com.kamann.product.domain.entity.Product;
import com.kamann.product.domain.dto.ProductDto;
import com.kamann.product.domain.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductMapperImpl implements ProductMapper {

    private final ModelMapper modelMapper;

    @Override
    public Product productDtoToProduct(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }

    @Override
    public ProductDto productToProductDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }
}
