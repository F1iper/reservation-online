package com.reservationonline.appointment.domain.mapper.impl;

import com.reservationonline.appointment.domain.entity.Appointment;
import com.reservationonline.appointment.domain.dto.AppointmentDto;
import com.reservationonline.appointment.domain.mapper.AppointmentMapper;
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
