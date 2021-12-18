package com.kamann.employee.service.impl;

import com.kamann.employee.domain.Employee;
import com.kamann.employee.dto.EmployeeDto;
import com.kamann.employee.mapper.EmployeeMapper;
import com.kamann.employee.repository.EmployeeRepository;
import com.kamann.employee.service.EmployeeListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeListServiceImpl implements EmployeeListService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDto> getEmployeesAsList() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees
                .stream()
                .map(employeeMapper::employeeToEmployeeDto)
                .collect(Collectors.toList());
    }
}
