package com.kamann.appointment.service;

import com.kamann.appointment.dto.AppointmentDto;

public interface AppointmentGetByIdService {

    AppointmentDto getById(Long id);
}
