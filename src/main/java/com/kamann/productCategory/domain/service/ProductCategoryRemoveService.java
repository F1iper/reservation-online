package com.kamann.productCategory.domain.service;

public interface ProductCategoryRemoveService {

    boolean removeIfIdExists(Long id);

    boolean productCategoryListIsEmpty();


}
