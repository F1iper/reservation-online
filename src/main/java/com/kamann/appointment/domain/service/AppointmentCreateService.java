package com.kamann.appointment.domain.service;

import com.kamann.appointment.domain.dto.AppointmentDto;

public interface AppointmentCreateService {

    AppointmentDto create(AppointmentDto appointmentDto);
}
