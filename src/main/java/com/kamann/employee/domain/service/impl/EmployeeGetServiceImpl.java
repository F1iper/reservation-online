package com.kamann.employee.domain.service.impl;

import com.kamann.employee.domain.dto.EmployeeDto;
import com.kamann.employee.domain.mapper.EmployeeMapper;
import com.kamann.employee.domain.repository.EmployeeRepository;
import com.kamann.employee.domain.service.EmployeeGetService;
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
