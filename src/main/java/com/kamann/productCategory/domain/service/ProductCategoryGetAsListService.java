package com.kamann.productCategory.domain.service;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;

import java.util.Collection;
import java.util.List;

public interface ProductCategoryGetAsListService {

    List<ProductCategoryDto> getProductCategoryAsList();

    boolean listIsEmpty(Collection<?> collection);
}
