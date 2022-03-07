package com.kamann.appointment.controller;

import com.kamann.appointment.domain.dto.AppointmentDto;
import com.kamann.appointment.domain.service.AppointmentAsListService;
import com.kamann.appointment.domain.service.AppointmentCreateService;
import com.kamann.appointment.domain.service.AppointmentDeleteService;
import com.kamann.appointment.domain.service.AppointmentGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentCreateService appointmentCreateService;
    private final AppointmentGetByIdService appointmentGetByIdService;
    private final AppointmentAsListService appointmentAsListService;
    private final AppointmentDeleteService appointmentDeleteService;

    @PostMapping
    public ResponseEntity<AppointmentDto> createAppointment(@RequestBody AppointmentDto appointmentDto) {
        return new ResponseEntity<>(appointmentCreateService.create(appointmentDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppointmentDto> getAppointmentById(@PathVariable Long id) {
        return new ResponseEntity<>(appointmentGetByIdService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> getAppointmentAsList() {
        return new ResponseEntity<>(appointmentAsListService.getAsList(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AppointmentDto> deleteAppointment(@PathVariable Long id) {
        if (appointmentDeleteService.delete(id)) {
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
