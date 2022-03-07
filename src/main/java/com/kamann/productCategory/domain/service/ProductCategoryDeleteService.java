package com.kamann.productCategory.domain.service;

public interface ProductCategoryDeleteService {

    boolean deleteIfIdExists(Long id);

    boolean productCategoryListIsEmpty();


}
