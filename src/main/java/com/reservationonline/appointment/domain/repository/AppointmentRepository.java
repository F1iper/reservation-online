package com.reservationonline.appointment.domain.repository;

import com.reservationonline.appointment.domain.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
