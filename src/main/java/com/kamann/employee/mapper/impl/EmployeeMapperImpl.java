package com.kamann.employee.mapper.impl;

import com.kamann.employee.domain.Employee;
import com.kamann.employee.dto.EmployeeDto;
import com.kamann.employee.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeMapperImpl implements EmployeeMapper {

    private final ModelMapper modelMapper;

    @Override
    public Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
        return modelMapper.map(employeeDto, Employee.class);
    }

    @Override
    public EmployeeDto employeeToEmployeeDto(Employee employee) {
        return modelMapper.map(employee, EmployeeDto.class);
    }
}
