package com.reservationonline.Category.domain.service.impl;

import com.reservationonline.Category.domain.dto.CategoryDto;
import com.reservationonline.Category.domain.repository.CategoryRepository;
import com.reservationonline.Category.domain.service.CategoryGetByIdService;
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
