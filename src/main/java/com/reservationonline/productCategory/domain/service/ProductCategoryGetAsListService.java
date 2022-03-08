package com.reservationonline.productCategory.domain.service;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;

import java.util.Collection;
import java.util.List;

public interface ProductCategoryGetAsListService {

    List<ProductCategoryDto> getProductCategoryAsList();

    boolean listIsEmpty(Collection<?> collection);
}
