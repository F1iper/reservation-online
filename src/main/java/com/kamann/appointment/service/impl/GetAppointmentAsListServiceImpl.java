package com.kamann.appointment.service.impl;

import com.kamann.appointment.domain.Appointment;
import com.kamann.appointment.dto.AppointmentDto;
import com.kamann.appointment.repository.AppointmentRepository;
import com.kamann.appointment.service.GetAppointmentAsListService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetAppointmentAsListServiceImpl implements GetAppointmentAsListService {

    private final AppointmentRepository appointmentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<AppointmentDto> getAppointmentAsList() {
        List<Appointment> theList = appointmentRepository.findAll();
        return theList
                .stream()
                .map(appointmentDto -> modelMapper.map(theList, AppointmentDto.class))
                .collect(Collectors.toList());
    }
}
