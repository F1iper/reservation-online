package com.kamann.employee.service.impl;

import com.kamann.employee.dto.EmployeeDto;
import com.kamann.employee.mapper.EmployeeMapper;
import com.kamann.employee.repository.EmployeeRepository;
import com.kamann.employee.service.EmployeeGetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeGetServiceImpl implements EmployeeGetService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        return employeeMapper.employeeToEmployeeDto(employeeRepository.getOne(id));
    }
}
