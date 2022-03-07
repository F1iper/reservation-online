package com.kamann.product.domain.service;

public interface ProductDeleteService {

    boolean productListIsEmpty();

    boolean deleteIfIdExists(Long id);
}
