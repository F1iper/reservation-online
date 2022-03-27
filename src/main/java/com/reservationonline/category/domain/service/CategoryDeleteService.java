package com.reservationonline.category.domain.service;

public interface CategoryDeleteService {

    boolean deleteIfIdExists(Long id);

    boolean productCategoryListIsEmpty();


}
