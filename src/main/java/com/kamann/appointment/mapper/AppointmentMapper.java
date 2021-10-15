package com.kamann.appointment.mapper;

import com.kamann.appointment.domain.Appointment;
import com.kamann.appointment.dto.AppointmentDto;

public interface AppointmentMapper {

    Appointment appointmentDtoToAppointment(AppointmentDto appointmentDto);

    AppointmentDto appointmentToAppointmentDto(Appointment appointment);
}
