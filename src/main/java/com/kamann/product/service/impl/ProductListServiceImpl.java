package com.kamann.product.service.impl;

import com.kamann.product.domain.Product;
import com.kamann.product.dto.ProductDto;
import com.kamann.product.repository.ProductRepository;
import com.kamann.product.service.ProductListService;
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
