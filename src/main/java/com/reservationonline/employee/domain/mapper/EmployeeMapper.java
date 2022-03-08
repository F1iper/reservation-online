package com.reservationonline.employee.domain.mapper;

import com.reservationonline.employee.domain.entity.Employee;
import com.reservationonline.employee.domain.dto.EmployeeDto;

public interface EmployeeMapper {

    Employee employeeDtoToEmployee(EmployeeDto employeeDto);

    EmployeeDto employeeToEmployeeDto(Employee employee);
}
