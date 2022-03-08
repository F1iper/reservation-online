package com.reservationonline.appointment.domain.service;

import com.reservationonline.appointment.domain.dto.AppointmentDto;

public interface AppointmentAddService {

    AppointmentDto create(AppointmentDto appointmentDto);
}
