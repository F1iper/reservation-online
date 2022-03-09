package com.reservationonline.product.controller;

import com.reservationonline.product.domain.dto.ProductDto;
import com.reservationonline.product.domain.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductGetByIdService getByIdService;
    private final ProductListService getAsListService;
    private final ProductAddService addService;
    private final ProductUpdateService updateService;
    private final ProductDeleteService deleteService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
        if (getByIdService.existsById(id))
            return new ResponseEntity<>(getByIdService.getProductById(id), HttpStatus.FOUND);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProductsAsList() {
        if (getAsListService.getProductsAsList().isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(getAsListService.getProductsAsList(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto dto) {
        return new ResponseEntity<>(addService.add(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDto> deleteProduct(@PathVariable Long id) {
        if (deleteService.deleteIfIdExists(id))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping
    public ResponseEntity<ProductDto> deleteAllProducts() {
        if (deleteService.productListIsEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
