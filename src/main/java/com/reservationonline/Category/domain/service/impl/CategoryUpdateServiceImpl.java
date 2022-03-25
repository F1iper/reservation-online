package com.reservationonline.Category.domain.service.impl;

import com.reservationonline.Category.domain.dto.CategoryDto;
import com.reservationonline.Category.domain.entity.Category;
import com.reservationonline.Category.domain.repository.CategoryRepository;
import com.reservationonline.Category.domain.service.CategoryUpdateService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryUpdateServiceImpl implements CategoryUpdateService {

    private final CategoryRepository repository;
    private final ModelMapper mapper;

    @Override
    //todo fix the implementation, this one does not do it's job...
    public boolean updateCategory(CategoryDto dto, Long id) {
        if (repository.existsById(id)) {
            List<Category> theList = repository.findAll();
            theList
                    .stream()
                    .map(productCategory -> {
                        if (productCategory.getId() == id) {
                            mapper.map(productCategory, CategoryDto.class);
                        }
                        return productCategory;
                    }).collect(Collectors.toList());
            return true;
        } else {
            return false;
        }
    }
}
