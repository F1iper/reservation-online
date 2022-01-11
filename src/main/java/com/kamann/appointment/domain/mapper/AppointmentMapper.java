package com.kamann.appointment.domain.mapper;

import com.kamann.appointment.domain.entity.Appointment;
import com.kamann.appointment.domain.dto.AppointmentDto;

public interface AppointmentMapper {

    Appointment appointmentDtoToAppointment(AppointmentDto appointmentDto);

    AppointmentDto appointmentToAppointmentDto(Appointment appointment);
}
