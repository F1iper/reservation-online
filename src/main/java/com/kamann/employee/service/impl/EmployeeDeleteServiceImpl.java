package com.kamann.employee.service.impl;

import com.kamann.employee.repository.EmployeeRepository;
import com.kamann.employee.service.EmployeeDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {

    private final EmployeeRepository employeeRepository;

    @Override
    public boolean delete(Long id) {
        return employeeRepository.existsById(id);
    }
}
