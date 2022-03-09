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
    public ProductDto update(ProductDto dto) {
        Product returnValue = new Product();

        ProductDto productDto = new ProductDto();
        mapper.map(dto, returnValue);

        ProductDto updatedProduct = updateProduct(productDto, id);
        mapper.map(updatedProduct, returnValue);

        return returnValue;
        //todo fix update product :] example -> https://www.appsdeveloperblog.com/putmapping-spring-mvc/
    }
}
