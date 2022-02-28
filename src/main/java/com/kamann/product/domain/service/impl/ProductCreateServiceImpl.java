package com.kamann.product.domain.service.impl;

import com.kamann.product.domain.dto.ProductDto;
import com.kamann.product.domain.entity.Product;
import com.kamann.product.domain.mapper.ProductMapper;
import com.kamann.product.domain.repository.ProductRepository;
import com.kamann.product.domain.service.ProductCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCreateServiceImpl implements ProductCreateService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductDto execute(ProductDto productDto) {
        //todo: does not support 'productCategory' (bigint in mysql) addition in postman request
        Product savedProduct = productRepository.save(productMapper.productDtoToProduct(productDto));
        return productMapper.productToProductDto(savedProduct);
    }
}
