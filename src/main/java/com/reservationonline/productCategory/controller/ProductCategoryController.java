package com.reservationonline.productCategory.controller;

import com.reservationonline.productCategory.domain.dto.ProductCategoryDto;
import com.reservationonline.productCategory.domain.service.*;
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
    private final ProductCategoryUpdateService updateService;
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

    @PutMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> updateProductCategory(@RequestBody ProductCategoryDto dto, @PathVariable Long id) {
        if (updateService.updateCategory(dto, id))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductCategoryDto> deleteProductCategoryById(@PathVariable Long id) {
        if (deleteService.deleteIfIdExists(id))
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
