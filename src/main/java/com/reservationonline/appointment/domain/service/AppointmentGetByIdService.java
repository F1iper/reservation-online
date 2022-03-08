package com.reservationonline.appointment.domain.service;

import com.reservationonline.appointment.domain.dto.AppointmentDto;

public interface AppointmentGetByIdService {

    AppointmentDto getById(Long id);

    boolean existsByID(Long id);
}
