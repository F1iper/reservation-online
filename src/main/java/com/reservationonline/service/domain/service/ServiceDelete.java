package com.reservationonline.service.domain.service;

public interface ServiceDelete {

    boolean productListIsEmpty();

    boolean deleteIfIdExists(Long id);
}
