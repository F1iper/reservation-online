package com.kamann.appointment.service.impl;

import com.kamann.appointment.dto.AppointmentDto;
import com.kamann.appointment.mapper.AppointmentMapper;
import com.kamann.appointment.repository.AppointmentRepository;
import com.kamann.appointment.service.AppointmentGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentGetByIdServiceImpl implements AppointmentGetByIdService {

    private final AppointmentRepository appointmentRepository;
    private final AppointmentMapper appointmentMapper;

    @Override
    public AppointmentDto getAppointmentById(Long id) {
        return appointmentMapper.appointmentToAppointmentDto(appointmentRepository.getOne(id));
    }
}
