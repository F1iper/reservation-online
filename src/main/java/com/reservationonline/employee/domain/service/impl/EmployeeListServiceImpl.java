package com.reservationonline.employee.domain.service.impl;

import com.reservationonline.employee.domain.dto.EmployeeDto;
import com.reservationonline.employee.domain.entity.Employee;
import com.reservationonline.employee.domain.mapper.EmployeeMapper;
import com.reservationonline.employee.domain.repository.EmployeeRepository;
import com.reservationonline.employee.domain.service.EmployeeListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeListServiceImpl implements EmployeeListService {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;

    @Override
    public List<EmployeeDto> getEmployeesAsList() {
        if (listIsEmpty(repository.findAll()))
            return new ArrayList<>();
        else {
            List<Employee> allEmployees = repository.findAll();
            return allEmployees
                    .stream()
                    .map(mapper::employeeToEmployeeDto)
                    .collect(Collectors.toList());
        }
    }

    @Override
    public boolean listIsEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty());
    }
}
