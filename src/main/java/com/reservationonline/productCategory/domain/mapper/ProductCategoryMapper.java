package com.reservationonline.productCategory.domain.mapper;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;
import com.reservationonline.productCategory.domain.entity.ProductCategory;

public interface ProductCategoryMapper {

    ProductCategory productCategoryDtoToProductCategory(ProductCategoryDto productCategoryDto);

    ProductCategoryDto productCategoryToProductCategoryDto(ProductCategory productCategory);
}
