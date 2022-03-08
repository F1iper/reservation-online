package com.reservationonline.product.domain.service.impl;

import com.reservationonline.product.domain.entity.Product;
import com.reservationonline.product.domain.dto.ProductDto;
import com.reservationonline.product.domain.mapper.ProductMapper;
import com.reservationonline.product.domain.repository.ProductRepository;
import com.reservationonline.product.domain.service.ProductGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductGetByIdServiceImpl implements ProductGetByIdService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductDto getProductById(Long id) {
        Product productById = repository.getOne(id);
        return mapper.productToProductDto(productById);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
