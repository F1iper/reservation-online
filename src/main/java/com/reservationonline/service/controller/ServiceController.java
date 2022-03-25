package com.reservationonline.service.controller;

import com.reservationonline.service.domain.dto.ServiceDto;
import com.reservationonline.service.domain.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ServiceController {

    private final ServiceGetById getByIdService;
    private final ServiceList getAsListService;
    private final ServiceAdd addService;
    private final ServiceUpdate updateService;
    private final ServiceDelete deleteService;

    @GetMapping("/{id}")
    public ResponseEntity<ServiceDto> getServiceById(@PathVariable Long id) {
        if (getByIdService.existsById(id))
            return new ResponseEntity<>(getByIdService.getProductById(id), HttpStatus.FOUND);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<ServiceDto>> getServicesAsList() {
        if (getAsListService.getProductsAsList().isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(getAsListService.getProductsAsList(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<ServiceDto> addService(@RequestBody ServiceDto dto) {
        return new ResponseEntity<>(addService.add(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiceDto> updateService(@RequestBody ServiceDto dto, @PathVariable Long id) {
    //todo when no id - return NOT_ACCEPTED
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ServiceDto> deleteService(@PathVariable Long id) {
        if (deleteService.deleteIfIdExists(id))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping
    public ResponseEntity<ServiceDto> deleteAllServices() {
        if (deleteService.productListIsEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
