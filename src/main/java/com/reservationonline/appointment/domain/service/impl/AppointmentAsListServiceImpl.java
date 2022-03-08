package com.reservationonline.appointment.domain.service.impl;

import com.reservationonline.appointment.domain.entity.Appointment;
import com.reservationonline.appointment.domain.dto.AppointmentDto;
import com.reservationonline.appointment.domain.repository.AppointmentRepository;
import com.reservationonline.appointment.domain.service.AppointmentAsListService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AppointmentAsListServiceImpl implements AppointmentAsListService {

    private final AppointmentRepository appointmentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<AppointmentDto> getAsList() {
        List<Appointment> theList = appointmentRepository.findAll();
        return theList
                .stream()
                .map(appointment -> modelMapper.map(appointment, AppointmentDto.class))
                .collect(Collectors.toList());
    }
}
