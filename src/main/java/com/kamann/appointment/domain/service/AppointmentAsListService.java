package com.kamann.appointment.domain.service;

import com.kamann.appointment.domain.dto.AppointmentDto;

import java.util.List;

public interface AppointmentAsListService {

    List<AppointmentDto> getAsList();
}
