package com.reservationonline.category.domain.service.impl;


import com.reservationonline.category.domain.dto.CategoryDto;
import com.reservationonline.category.domain.entity.Category;
import com.reservationonline.category.domain.repository.CategoryRepository;
import com.reservationonline.category.domain.service.CategoryAddService;
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