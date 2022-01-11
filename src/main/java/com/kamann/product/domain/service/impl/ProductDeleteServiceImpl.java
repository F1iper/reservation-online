package com.kamann.product.domain.service.impl;

import com.kamann.exception.ResourceNotFoundException;
import com.kamann.product.domain.entity.Product;
import com.kamann.product.domain.repository.ProductRepository;
import com.kamann.product.domain.service.ProductDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDeleteServiceImpl implements ProductDeleteService {

    private final ProductRepository productRepository;

    @Override
    public boolean delete(Long id) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product with id: [" + id + "] not found."));
        productRepository.deleteById(product.getId());
        return productRepository.existsById(id);
    }
}
