package com.kamann.product.controller;

import com.kamann.product.dto.ProductDto;
import com.kamann.product.service.ProductCreateService;
import com.kamann.product.service.ProductDeleteService;
import com.kamann.product.service.ProductGetByIdService;
import com.kamann.product.service.ProductListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductGetByIdService productGetByIdService;
    private final ProductListService productListService;
    private final ProductCreateService productCreateService;
    private final ProductDeleteService productDeleteService;

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        return new ResponseEntity<>(productCreateService.execute(productDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
        return new ResponseEntity<>(productGetByIdService.getProductById(id), HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProductAsList() {
        return new ResponseEntity<>(productListService.getProductsAsList(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<ProductDto> deleteProduct(@PathVariable Long id) {
        if (productDeleteService.delete(id)) {
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
