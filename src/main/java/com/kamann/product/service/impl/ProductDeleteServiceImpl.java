package com.kamann.product.service.impl;

import com.kamann.exception.ResourceNotFoundException;
import com.kamann.product.domain.Product;
import com.kamann.product.repository.ProductRepository;
import com.kamann.product.service.ProductDeleteService;
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
