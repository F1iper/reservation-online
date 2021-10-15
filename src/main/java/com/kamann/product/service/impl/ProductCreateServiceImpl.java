package com.kamann.product.service.impl;

import com.kamann.product.dto.ProductDto;
import com.kamann.product.repository.ProductRepository;
import com.kamann.product.service.ProductCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCreateServiceImpl implements ProductCreateService {

    private final ProductRepository productRepository;
//    private final ProductMapper productMapper;

    @Override
    public ProductDto execute(ProductDto productDto) {
        //todo: Dto to entity -> save -> entity to Dto -> return dto (?)
        return new ProductDto();
    }
}
