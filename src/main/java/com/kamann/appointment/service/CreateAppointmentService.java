package com.kamann.appointment.service;

import com.kamann.appointment.dto.AppointmentDto;

public interface CreateAppointmentService {

    AppointmentDto createAppointment(AppointmentDto appointmentDto);
}