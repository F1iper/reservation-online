package com.reservationonline.employee.domain.service.impl;

import com.reservationonline.employee.domain.repository.EmployeeRepository;
import com.reservationonline.employee.domain.service.EmployeeDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {

    private final EmployeeRepository repository;

    @Override
    public boolean employeeListIsEmpty() {
        if (repository.findAll().isEmpty())
            return true;
        else {
            repository.deleteAll();
            return false;
        }
    }

    @Override
    public boolean deleteIfIdExists(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else
            return false;
    }
}
