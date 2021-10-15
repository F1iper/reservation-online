package com.kamann.appointment.mapper.impl;

import com.kamann.appointment.domain.Appointment;
import com.kamann.appointment.dto.AppointmentDto;
import com.kamann.appointment.mapper.AppointmentMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentMapperImpl implements AppointmentMapper {

    private final ModelMapper modelMapper;

    @Override
    public Appointment appointmentDtoToAppointment(AppointmentDto appointmentDto) {
        return modelMapper.map(appointmentDto, Appointment.class);
    }

    @Override
    public AppointmentDto appointmentToAppointmentDto(Appointment appointment) {
        return modelMapper.map(appointment, AppointmentDto.class);
    }
}
