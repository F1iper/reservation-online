package com.kamann.appointment.service;

import com.kamann.appointment.dto.AppointmentDto;

public interface AppointmentCreateService {

    AppointmentDto create(AppointmentDto appointmentDto);
}
