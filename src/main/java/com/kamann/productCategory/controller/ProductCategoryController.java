package com.kamann.productCategory.controller;

import com.kamann.productCategory.domain.dto.ProductCategoryDto;
import com.kamann.productCategory.domain.service.ProductCategoryAddService;
import com.kamann.productCategory.domain.service.ProductCategoryGetAsListService;
import com.kamann.productCategory.domain.service.ProductCategoryGetByIdService;
import com.kamann.productCategory.domain.service.ProductCategoryDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class ProductCategoryController {

    private final ProductCategoryGetByIdService getByIdService;
    private final ProductCategoryGetAsListService getAsListService;
    private final ProductCategoryAddService addService;
    private final ProductCategoryDeleteService deleteService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> getProductCategoryById(@PathVariable Long id) {
        if (getByIdService.existsById(id))
            return new ResponseEntity<>(getByIdService.getProductCategoryDtoById(id), HttpStatus.FOUND);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<ProductCategoryDto>> getProductCategories() {
        if (getAsListService.getProductCategoryAsList().isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(getAsListService.getProductCategoryAsList(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<ProductCategoryDto> addProductCategory(@RequestBody ProductCategoryDto dto) {
        return new ResponseEntity<>(addService.add(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> deleteProductCategoryById(@PathVariable Long id) {
        if (deleteService.removeIfIdExists(id))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping
    public ResponseEntity<ProductCategoryDto> deleteAllProductCategories() {
        if (deleteService.productCategoryListIsEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(HttpStatus.ACCEPTED);

    }
}
