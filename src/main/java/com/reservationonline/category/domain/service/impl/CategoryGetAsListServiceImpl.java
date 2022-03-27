package com.reservationonline.category.domain.service.impl;

import com.reservationonline.category.domain.dto.CategoryDto;
import com.reservationonline.category.domain.entity.Category;
import com.reservationonline.category.domain.repository.CategoryRepository;
import com.reservationonline.category.domain.service.CategoryGetAsListService;
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
public class CategoryGetAsListServiceImpl implements CategoryGetAsListService {

    private final CategoryRepository repository;
    private final ModelMapper mapper;

    @Override
    //todo there are 4 queries when there is 1 resource -> fix that :]
    public List<CategoryDto> getProductCategoryAsList() {
        if (listIsEmpty(repository.findAll()))
            return new ArrayList<>();
        else {
            List<Category> theList = repository.findAll();
            Stream<CategoryDto> mappedList = theList.stream()
                    .map(productCategory -> mapper.map(productCategory, CategoryDto.class));
            return mappedList.collect(Collectors.toList());
        }
    }

    @Override
    public boolean listIsEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty());
    }
}
