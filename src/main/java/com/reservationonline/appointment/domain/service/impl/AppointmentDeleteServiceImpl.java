package com.reservationonline.appointment.domain.service.impl;

import com.reservationonline.appointment.domain.repository.AppointmentRepository;
import com.reservationonline.appointment.domain.service.AppointmentDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentDeleteServiceImpl implements AppointmentDeleteService {

    private final AppointmentRepository repository;

    @Override
    public boolean appointmentListIsEmpty() {
        if (repository.findAll().isEmpty())
            return true;
        else {
            repository.deleteAll();
            return false;
        }
    }

    @Override
    public boolean removeIfIdExists(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else
            return false;
    }
}
