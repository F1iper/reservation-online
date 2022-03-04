package com.kamann.productCategory.controller;

import com.kamann.productCategory.domain.entity.ProductCategory;
import com.kamann.productCategory.domain.repository.ProductCategoryRepository;
import com.kamann.productCategory.domain.service.ProductCategoryGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class ProductCategoryController {

    private final ProductCategoryRepository repository;
    private final ProductCategoryGetByIdService getByIdService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategory> getCategoryById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.getOne(id), HttpStatus.OK);
    }

    @GetMapping
    public List<ProductCategory> getCategories() {
        ArrayList<ProductCategory> theList = new ArrayList<>(repository.findAll());
        return theList;
    }

    @PostMapping
    public ResponseEntity<ProductCategory> addProductCategory(@RequestBody ProductCategory category) {
        repository.save(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
}
