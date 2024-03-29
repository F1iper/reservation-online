package com.reservationonline.employee.domain.mapper.impl;

import com.reservationonline.employee.domain.entity.Employee;
import com.reservationonline.employee.domain.dto.EmployeeDto;
import com.reservationonline.employee.domain.mapper.EmployeeMapper;
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
