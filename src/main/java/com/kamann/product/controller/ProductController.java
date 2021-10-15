package com.kamann.product.controller;

import com.kamann.product.service.ProductCreateService;
import com.kamann.product.service.ProductGetService;
import com.kamann.product.service.ProductListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductGetService getProductService;
    private final ProductListService listProductService;
    private final ProductCreateService createProductService;
}
