package com.reservationonline.Category.domain.service;

import com.reservationonline.Category.domain.dto.CategoryDto;

import java.util.Collection;
import java.util.List;

public interface CategoryGetAsListService {

    List<CategoryDto> getProductCategoryAsList();

    boolean listIsEmpty(Collection<?> collection);
}
