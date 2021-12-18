package com.kamann.employee.service;

import com.kamann.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeListService {

    List<EmployeeDto> getEmployeesAsList();
}
