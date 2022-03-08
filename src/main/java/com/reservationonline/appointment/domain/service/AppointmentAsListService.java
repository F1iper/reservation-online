package com.reservationonline.appointment.domain.service;

import com.reservationonline.appointment.domain.dto.AppointmentDto;

import java.util.List;

public interface AppointmentAsListService {

    List<AppointmentDto> getAsList();
}
