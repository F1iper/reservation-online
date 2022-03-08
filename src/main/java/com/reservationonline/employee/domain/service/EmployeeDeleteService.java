package com.reservationonline.employee.domain.service;

public interface EmployeeDeleteService {

    boolean deleteIfIdExists(Long id);

    boolean employeeListIsEmpty();

}
