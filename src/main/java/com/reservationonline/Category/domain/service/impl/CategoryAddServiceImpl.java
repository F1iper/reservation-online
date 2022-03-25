package com.reservationonline.Category.domain.service.impl;


import com.reservationonline.Category.domain.dto.CategoryDto;
import com.reservationonline.Category.domain.entity.Category;
import com.reservationonline.Category.domain.repository.CategoryRepository;
import com.reservationonline.Category.domain.service.CategoryAddService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryAddServiceImpl implements CategoryAddService {

    private final CategoryRepository repository;
    private final ModelMapper mapper;


    @Override
    public CategoryDto add(CategoryDto dto) {
        Category save = repository.save(mapper.map(dto, Category.class));
        return mapper.map(save, CategoryDto.class);
    }
}