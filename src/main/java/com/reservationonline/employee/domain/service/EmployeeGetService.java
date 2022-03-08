package com.reservationonline.employee.domain.service;

import com.reservationonline.employee.domain.dto.EmployeeDto;

public interface EmployeeGetService {

    EmployeeDto getEmployeeById(Long id);

    boolean existsById(Long id);
}
