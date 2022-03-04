package com.kamann.productCategory.domain.mapper;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;
import com.kamann.productCategory.domain.entity.ProductCategory;

public interface ProductCategoryMapper {

    ProductCategory productCategoryDtoToProductCategory(ProductCategoryDto productCategoryDto);

    ProductCategoryDto productCategoryToProductCategoryDto(ProductCategory productCategory);
}
