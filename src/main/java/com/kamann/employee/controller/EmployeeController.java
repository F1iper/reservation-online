package com.kamann.employee.controller;

import com.kamann.employee.domain.dto.EmployeeDto;
import com.kamann.employee.domain.service.EmployeeCreateService;
import com.kamann.employee.domain.service.EmployeeDeleteService;
import com.kamann.employee.domain.service.EmployeeGetService;
import com.kamann.employee.domain.service.EmployeeListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeCreateService employeeCreateService;
    private final EmployeeGetService employeeGetService;
    private final EmployeeListService employeeListService;
    private final EmployeeDeleteService employeeDeleteService;


    @PostMapping
    public ResponseEntity<EmployeeDto> add(@RequestBody EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeCreateService.execute(employeeDto), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(employeeGetService.getEmployeeById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAsList() {
        return new ResponseEntity<>(employeeListService.getEmployeesAsList(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> remove(@PathVariable Long id) {
        employeeDeleteService.delete(id);
        return new ResponseEntity<>(id, HttpStatus.ACCEPTED);
    }
}
