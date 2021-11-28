package com.kamann.product.service.impl;

import com.kamann.product.domain.Product;
import com.kamann.product.dto.ProductDto;
import com.kamann.product.mapper.ProductMapper;
import com.kamann.product.repository.ProductRepository;
import com.kamann.product.service.ProductGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductGetByIdServiceImpl implements ProductGetByIdService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductDto getProductById(Long id) {
        Product productById = productRepository.getOne(id);
        return productMapper.productToProductDto(productById);
    }
}
