package com.kamann.employee.mapper;

import com.kamann.employee.domain.Employee;
import com.kamann.employee.dto.EmployeeDto;

public interface EmployeeMapper {

    Employee employeeDtoToEmployee(EmployeeDto employeeDto);

    EmployeeDto employeeToEmployeeDto(Employee employee);
}
