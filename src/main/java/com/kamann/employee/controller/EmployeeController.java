package com.kamann.employee.controller;

import com.kamann.employee.domain.dto.EmployeeDto;
import com.kamann.employee.domain.service.EmployeeAddService;
import com.kamann.employee.domain.service.EmployeeDeleteService;
import com.kamann.employee.domain.service.EmployeeGetService;
import com.kamann.employee.domain.service.EmployeeListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeGetService getByIdService;
    private final EmployeeListService getAsListService;
    private final EmployeeAddService addService;
    private final EmployeeDeleteService deleteService;


    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
        if (getByIdService.existsById(id))
            return new ResponseEntity<>(getByIdService.getEmployeeById(id), HttpStatus.FOUND);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getEmployeesAsList() {
        if (getAsListService.getEmployeesAsList().isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(getAsListService.getEmployeesAsList(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto dto) {
        return new ResponseEntity<>(addService.execute(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EmployeeDto> deleteEmployee(@PathVariable Long id) {
        if (deleteService.deleteIfIdExists(id))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping
    public ResponseEntity<EmployeeDto> deleteAllEmployees() {
        if (deleteService.employeeListIsEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
