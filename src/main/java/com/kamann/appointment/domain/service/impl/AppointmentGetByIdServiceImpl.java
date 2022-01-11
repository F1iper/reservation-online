package com.kamann.appointment.domain.service.impl;

import com.kamann.appointment.domain.dto.AppointmentDto;
import com.kamann.appointment.domain.mapper.AppointmentMapper;
import com.kamann.appointment.domain.repository.AppointmentRepository;
import com.kamann.appointment.domain.service.AppointmentGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentGetByIdServiceImpl implements AppointmentGetByIdService {

    private final AppointmentRepository appointmentRepository;
    private final AppointmentMapper appointmentMapper;

    @Override
    public AppointmentDto getById(Long id) {
        return appointmentMapper.appointmentToAppointmentDto(appointmentRepository.getOne(id));
    }
}
