package com.reservationonline.productCategory.domain.service;

public interface ProductCategoryDeleteService {

    boolean deleteIfIdExists(Long id);

    boolean productCategoryListIsEmpty();


}
