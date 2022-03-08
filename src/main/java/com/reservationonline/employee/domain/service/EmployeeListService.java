package com.reservationonline.employee.domain.service;

import com.reservationonline.employee.domain.dto.EmployeeDto;

import java.util.Collection;
import java.util.List;

public interface EmployeeListService {

    List<EmployeeDto> getEmployeesAsList();

    boolean listIsEmpty(Collection<?> collection);
}
