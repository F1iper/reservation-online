package com.reservationonline.productCategory.domain.service.impl;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;
import com.reservationonline.productCategory.domain.repository.ProductCategoryRepository;
import com.reservationonline.productCategory.domain.service.ProductCategoryGetByIdService;
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

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
