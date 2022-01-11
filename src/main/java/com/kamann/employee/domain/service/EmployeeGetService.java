package com.kamann.employee.domain.service;

import com.kamann.employee.domain.dto.EmployeeDto;

public interface EmployeeGetService {

    EmployeeDto getEmployeeById(Long id);
}
