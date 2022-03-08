package com.reservationonline.product.domain.service;

public interface ProductDeleteService {

    boolean productListIsEmpty();

    boolean deleteIfIdExists(Long id);
}
