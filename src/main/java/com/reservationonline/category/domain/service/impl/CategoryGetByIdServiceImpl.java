package com.reservationonline.category.domain.service.impl;

import com.reservationonline.category.domain.dto.CategoryDto;
import com.reservationonline.category.domain.repository.CategoryRepository;
import com.reservationonline.category.domain.service.CategoryGetByIdService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CategoryGetByIdServiceImpl implements CategoryGetByIdService {

    private final CategoryRepository repository;
    private final ModelMapper mapper;

    @Override
    public CategoryDto getProductCategoryDtoById(Long id) {
        return mapper.map(repository.getOne(id), CategoryDto.class);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
