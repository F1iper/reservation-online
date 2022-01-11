package com.kamann.appointment.domain.service.impl;

import com.kamann.appointment.domain.entity.Appointment;
import com.kamann.appointment.domain.repository.AppointmentRepository;
import com.kamann.appointment.domain.service.AppointmentDeleteService;
import com.kamann.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentDeleteServiceImpl implements AppointmentDeleteService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public boolean delete(Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Appointment with id: [" + id + "] not found."));
        appointmentRepository.deleteById(appointment.getId());
        return !appointmentRepository.existsById(id);
    }
    //todo: postman that!
}
