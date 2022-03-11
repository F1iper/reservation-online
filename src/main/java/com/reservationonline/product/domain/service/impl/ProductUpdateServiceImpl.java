package com.reservationonline.product.domain.service.impl;

import com.reservationonline.product.domain.dto.ProductDto;
import com.reservationonline.product.domain.entity.Product;
import com.reservationonline.product.domain.repository.ProductRepository;
import com.reservationonline.product.domain.service.ProductUpdateService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductUpdateServiceImpl implements ProductUpdateService {

    private final ProductRepository repository;
    private final ModelMapper mapper;


    @Override
    public ProductDto update(ProductDto dto, Long id) {
        Product productFromDb = repository.getOne(id);
        mapper.map(dto, productFromDb);
        return mapper.map(productFromDb, ProductDto.class);
    }

    @Override
    public boolean ifExists(Long id) {
        return repository.existsById(id);
    }
}
