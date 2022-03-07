package com.kamann.appointment.domain.service;

import com.kamann.appointment.domain.dto.AppointmentDto;

public interface AppointmentAddService {

    AppointmentDto create(AppointmentDto appointmentDto);
}
