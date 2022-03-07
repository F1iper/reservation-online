package com.kamann.productCategory.controller;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;
import com.kamann.productCategory.domain.entity.ProductCategory;
import com.kamann.productCategory.domain.repository.ProductCategoryRepository;
import com.kamann.productCategory.domain.service.ProductCategoryAddService;
import com.kamann.productCategory.domain.service.ProductCategoryGetAsListService;
import com.kamann.productCategory.domain.service.ProductCategoryGetByIdService;
import com.kamann.productCategory.domain.service.ProductCategoryRemoveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
@Slf4j
public class ProductCategoryController {

    private final ProductCategoryRepository repository;
    private final ProductCategoryGetByIdService getById;
    private final ProductCategoryGetAsListService getAsList;
    private final ProductCategoryRemoveService removeService;
    private final ProductCategoryAddService addService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> getCategoryById(@PathVariable Long id) {
        if (getById.existsById(id))
            return new ResponseEntity<>(getById.getProductCategoryDtoById(id), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<ProductCategoryDto>> getCategories() {
        if (getAsList.getProductCategoryAsList().isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(getAsList.getProductCategoryAsList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductCategoryDto> addProductCategory(@RequestBody ProductCategoryDto dto) {
        return new ResponseEntity<>(addService.add(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> removeProductCategory(@PathVariable Long id) {
        if (removeService.removeIfIdExists(id))
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping
    public ResponseEntity<ProductCategoryDto> removeAllProductCategories() {
        if (removeService.productCategoryListIsEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(HttpStatus.ACCEPTED);


    }
}
