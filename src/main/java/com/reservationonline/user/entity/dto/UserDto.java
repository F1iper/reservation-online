package com.reservationonline.user.entity.dto;

import com.reservationonline.client.domain.entity.Client;
import com.reservationonline.employee.domain.entity.Employee;

import java.time.LocalDateTime;

public class UserDto {

    private String login;
    private String password;
    private LocalDateTime createdAt;
    private Client client;
    private Employee employee;

}
