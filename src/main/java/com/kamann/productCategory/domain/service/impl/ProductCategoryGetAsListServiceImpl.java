package com.kamann.productCategory.domain.service.impl;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;
import com.kamann.productCategory.domain.entity.ProductCategory;
import com.kamann.productCategory.domain.repository.ProductCategoryRepository;
import com.kamann.productCategory.domain.service.ProductCategoryGetAsListService;
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
    public List<ProductCategoryDto> getProductCategoryAsList() {
        if(listIsEmpty(repository.findAll()))
            return new ArrayList<>();
        else {
            List<ProductCategory> theList = new ArrayList<>();
            theList.addAll(repository.findAll());
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
