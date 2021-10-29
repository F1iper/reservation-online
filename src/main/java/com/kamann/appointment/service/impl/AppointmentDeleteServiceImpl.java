package com.kamann.appointment.service.impl;

import com.kamann.appointment.domain.Appointment;
import com.kamann.appointment.repository.AppointmentRepository;
import com.kamann.appointment.service.AppointmentDeleteService;
import com.kamann.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentDeleteServiceImpl implements AppointmentDeleteService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public boolean delete(Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Appointment not found: " + id));
        appointmentRepository.deleteById(appointment.getId());
        return !appointmentRepository.existsById(id);
    }
}
