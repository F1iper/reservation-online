package com.kamann.appointment.service.impl;

import com.kamann.appointment.domain.Appointment;
import com.kamann.appointment.dto.AppointmentDto;
import com.kamann.appointment.repository.AppointmentRepository;
import com.kamann.appointment.service.AppointmentCreateService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentCreateServiceImpl implements AppointmentCreateService {

    private final ModelMapper modelMapper;
    private final AppointmentRepository appointmentRepository;

    @Override
    public AppointmentDto create(AppointmentDto appointmentDto) {
        Appointment mappedAppointment = modelMapper.map(appointmentDto, Appointment.class);
        appointmentRepository.save(modelMapper.map(mappedAppointment, Appointment.class)); //todo: check save method, yes/no
        return modelMapper.map(mappedAppointment, AppointmentDto.class);
    }
}
