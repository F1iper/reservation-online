package com.reservationonline.category.domain.service;

import com.reservationonline.category.domain.dto.CategoryDto;

import java.util.Collection;
import java.util.List;

public interface CategoryGetAsListService {

    List<CategoryDto> getProductCategoryAsList();

    boolean listIsEmpty(Collection<?> collection);
}
