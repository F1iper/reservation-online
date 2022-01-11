package com.kamann.employee.domain.mapper;

import com.kamann.employee.domain.entity.Employee;
import com.kamann.employee.domain.dto.EmployeeDto;

public interface EmployeeMapper {

    Employee employeeDtoToEmployee(EmployeeDto employeeDto);

    EmployeeDto employeeToEmployeeDto(Employee employee);
}
