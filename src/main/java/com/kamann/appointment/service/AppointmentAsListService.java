package com.kamann.appointment.service;

import com.kamann.appointment.dto.AppointmentDto;

import java.util.List;

public interface AppointmentAsListService {

    List<AppointmentDto> getAsList();
}
