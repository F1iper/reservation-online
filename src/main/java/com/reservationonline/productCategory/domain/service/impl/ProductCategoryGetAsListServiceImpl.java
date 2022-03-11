package com.reservationonline.productCategory.domain.service.impl;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;
import com.reservationonline.productCategory.domain.entity.ProductCategory;
import com.reservationonline.productCategory.domain.repository.ProductCategoryRepository;
import com.reservationonline.productCategory.domain.service.ProductCategoryGetAsListService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class ProductCategoryGetAsListServiceImpl implements ProductCategoryGetAsListService {

    private final ProductCategoryRepository repository;
    private final ModelMapper mapper;

    @Override
    //todo there are 4 queries when there is 1 resource -> fix that :]
    public List<ProductCategoryDto> getProductCategoryAsList() {
        if (listIsEmpty(repository.findAll()))
            return new ArrayList<>();
        else {
            List<ProductCategory> theList = repository.findAll();
            Stream<ProductCategoryDto> mappedList = theList.stream()
                    .map(productCategory -> mapper.map(productCategory, ProductCategoryDto.class));
            return mappedList.collect(Collectors.toList());
        }
    }

    @Override
    public boolean listIsEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty());
    }
}
