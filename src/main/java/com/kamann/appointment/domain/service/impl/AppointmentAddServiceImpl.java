package com.kamann.appointment.domain.service.impl;

import com.kamann.appointment.domain.entity.Appointment;
import com.kamann.appointment.domain.dto.AppointmentDto;
import com.kamann.appointment.domain.repository.AppointmentRepository;
import com.kamann.appointment.domain.service.AppointmentAddService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentAddServiceImpl implements AppointmentAddService {

    private final ModelMapper modelMapper;
    private final AppointmentRepository appointmentRepository;

    @Override
    public AppointmentDto create(AppointmentDto appointmentDto) {
        Appointment mappedAppointment = modelMapper.map(appointmentDto, Appointment.class);
        appointmentRepository.save(modelMapper.map(mappedAppointment, Appointment.class)); //todo: check save method, yes/no
        return modelMapper.map(mappedAppointment, AppointmentDto.class);
    }
}
