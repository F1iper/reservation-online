package com.reservationonline.product.domain.service.impl;

import com.reservationonline.product.domain.entity.Product;
import com.reservationonline.product.domain.dto.ProductDto;
import com.reservationonline.product.domain.repository.ProductRepository;
import com.reservationonline.product.domain.service.ProductListService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductListServiceImpl implements ProductListService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDto> getProductsAsList() {
        List<Product> productList = productRepository.findAll();
        return productList.
                stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }
}
