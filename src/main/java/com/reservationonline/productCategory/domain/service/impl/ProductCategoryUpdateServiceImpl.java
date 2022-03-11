package com.reservationonline.productCategory.domain.service.impl;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;
import com.reservationonline.productCategory.domain.entity.ProductCategory;
import com.reservationonline.productCategory.domain.repository.ProductCategoryRepository;
import com.reservationonline.productCategory.domain.service.ProductCategoryUpdateService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductCategoryUpdateServiceImpl implements ProductCategoryUpdateService {

    private final ProductCategoryRepository repository;
    private final ModelMapper mapper;

    @Override
    //todo fix the implementation, this one does not do it's job...
    public boolean updateCategory(ProductCategoryDto dto, Long id) {
        if (repository.existsById(id)) {
            List<ProductCategory> theList = repository.findAll();
            theList
                    .stream()
                    .map(productCategory -> {
                        if (productCategory.getId() == id) {
                            mapper.map(productCategory, ProductCategoryDto.class);
                        }
                        return productCategory;
                    }).collect(Collectors.toList());
            return true;
        } else {
            return false;
        }
    }
}
