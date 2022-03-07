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

    private final AppointmentRepository repository;
    private final AppointmentMapper mapper;

    @Override
    public AppointmentDto getById(Long id) {
        return mapper.appointmentToAppointmentDto(repository.getOne(id));
    }

    @Override
    public boolean existsByID(Long id) {
        return repository.existsById(id);
    }
}
