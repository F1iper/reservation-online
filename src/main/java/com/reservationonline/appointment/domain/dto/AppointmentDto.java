package com.reservationonline.appointment.domain.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentDto {

    private Long id;

    private String description;

    private LocalDate date;
}
