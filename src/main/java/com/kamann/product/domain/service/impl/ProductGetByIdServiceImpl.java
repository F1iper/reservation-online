package com.kamann.product.domain.service.impl;

import com.kamann.product.domain.entity.Product;
import com.kamann.product.domain.dto.ProductDto;
import com.kamann.product.domain.mapper.ProductMapper;
import com.kamann.product.domain.repository.ProductRepository;
import com.kamann.product.domain.service.ProductGetByIdService;
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
