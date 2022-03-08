package com.reservationonline.appointment.domain.mapper;

import com.reservationonline.appointment.domain.entity.Appointment;
import com.reservationonline.appointment.domain.dto.AppointmentDto;

public interface AppointmentMapper {

    Appointment appointmentDtoToAppointment(AppointmentDto appointmentDto);

    AppointmentDto appointmentToAppointmentDto(Appointment appointment);
}
