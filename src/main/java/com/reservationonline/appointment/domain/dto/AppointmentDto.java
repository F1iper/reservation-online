package com.reservationonline.appointment.domain.dto;

import com.reservationonline.client.domain.entity.Client;
import com.reservationonline.employee.domain.entity.Employee;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentDto {

    private Long id;
    private String description;
    private LocalDateTime date;
    private Employee employee;
    private Client client;
}
