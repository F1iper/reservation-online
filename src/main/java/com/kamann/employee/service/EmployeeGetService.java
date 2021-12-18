package com.kamann.employee.service;

import com.kamann.employee.dto.EmployeeDto;

public interface EmployeeGetService {

    EmployeeDto getEmployeeById(Long id);
}
