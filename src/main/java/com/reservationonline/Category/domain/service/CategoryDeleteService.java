package com.reservationonline.Category.domain.service;

public interface CategoryDeleteService {

    boolean deleteIfIdExists(Long id);

    boolean productCategoryListIsEmpty();


}
