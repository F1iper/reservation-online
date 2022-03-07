package com.kamann.productCategory.domain.service;

public interface ProductCategoryDeleteService {

    boolean removeIfIdExists(Long id);

    boolean productCategoryListIsEmpty();


}
