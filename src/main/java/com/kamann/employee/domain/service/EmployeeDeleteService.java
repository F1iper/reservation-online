package com.kamann.employee.domain.service;

public interface EmployeeDeleteService {

    boolean deleteIfIdExists(Long id);

    boolean employeeListIsEmpty();

}
