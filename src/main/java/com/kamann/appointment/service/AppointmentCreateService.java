package com.kamann.appointment.service;

import com.kamann.appointment.dto.AppointmentDto;

public interface AppointmentCreateService {

    AppointmentDto createAppointment(AppointmentDto appointmentDto);
}
