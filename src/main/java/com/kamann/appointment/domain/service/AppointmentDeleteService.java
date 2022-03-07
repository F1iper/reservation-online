package com.kamann.appointment.domain.service;

public interface AppointmentDeleteService {

    boolean removeIfIdExists(Long id);

    boolean appointmentListIsEmpty();
}
