package com.kamann.employee.service.impl;

import com.kamann.employee.domain.Employee;
import com.kamann.employee.dto.EmployeeDto;
import com.kamann.employee.mapper.EmployeeMapper;
import com.kamann.employee.repository.EmployeeRepository;
import com.kamann.employee.service.EmployeeCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeCreateServiceImpl implements EmployeeCreateService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto execute(EmployeeDto employeeDto) {
        Employee savedEmployee = employeeRepository.save(employeeMapper.employeeDtoToEmployee(employeeDto));
        return employeeMapper.employeeToEmployeeDto(savedEmployee);
    }
}
