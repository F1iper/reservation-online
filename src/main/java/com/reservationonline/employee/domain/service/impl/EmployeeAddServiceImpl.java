package com.reservationonline.employee.domain.service.impl;

import com.reservationonline.employee.domain.entity.Employee;
import com.reservationonline.employee.domain.dto.EmployeeDto;
import com.reservationonline.employee.domain.mapper.EmployeeMapper;
import com.reservationonline.employee.domain.repository.EmployeeRepository;
import com.reservationonline.employee.domain.service.EmployeeAddService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeAddServiceImpl implements EmployeeAddService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto execute(EmployeeDto employeeDto) {
        Employee savedEmployee = employeeRepository.save(employeeMapper.employeeDtoToEmployee(employeeDto));
        return employeeMapper.employeeToEmployeeDto(savedEmployee);
    }
}
