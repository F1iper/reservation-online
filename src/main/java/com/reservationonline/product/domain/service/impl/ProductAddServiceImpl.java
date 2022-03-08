package com.reservationonline.product.domain.service.impl;

import com.reservationonline.product.domain.dto.ProductDto;
import com.reservationonline.product.domain.entity.Product;
import com.reservationonline.product.domain.mapper.ProductMapper;
import com.reservationonline.product.domain.repository.ProductRepository;
import com.reservationonline.product.domain.service.ProductAddService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductAddServiceImpl implements ProductAddService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductDto add(ProductDto productDto) {
        Product savedProduct = repository.save(mapper.productDtoToProduct(productDto));
        return mapper.productToProductDto(savedProduct);
    }
}
