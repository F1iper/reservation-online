package com.kamann.productCategory.domain.service.impl;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;
import com.kamann.productCategory.domain.repository.ProductCategoryRepository;
import com.kamann.productCategory.domain.service.ProductCategoryGetByIdService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProductCategoryGetByIdServiceImpl implements ProductCategoryGetByIdService {

    private final ProductCategoryRepository repository;
    private final ModelMapper mapper;

    @Override
    public ProductCategoryDto getProductCategoryDtoById(Long id) {
        return mapper.map(repository.getOne(id), ProductCategoryDto.class);
    }
}
