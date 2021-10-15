package com.kamann.appointment.service;

import com.kamann.appointment.dto.AppointmentDto;

public interface GetAppointmentByIdService {

    AppointmentDto getAppointmentById(Long id);
}
