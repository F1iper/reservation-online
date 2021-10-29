package com.kamann.appointment.controller;

import com.kamann.appointment.dto.AppointmentDto;
import com.kamann.appointment.service.AppointmentAsListService;
import com.kamann.appointment.service.AppointmentCreateService;
import com.kamann.appointment.service.AppointmentDeleteService;
import com.kamann.appointment.service.AppointmentGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentCreateService appointmentCreateService;
    private final AppointmentGetByIdService appointmentGetByIdService;
    private final AppointmentAsListService appointmentAsListService;
    private final AppointmentDeleteService appointmentDeleteService;

    @PostMapping
    public ResponseEntity<AppointmentDto> createAppointment(@RequestBody AppointmentDto appointmentDto) {
        return new ResponseEntity<>(appointmentCreateService.createAppointment(appointmentDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppointmentDto> getAppointmentById(@PathVariable Long id) {
        return new ResponseEntity<>(appointmentGetByIdService.getAppointmentById(id), HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> getAppointmentAsList() {
        return new ResponseEntity<>(appointmentAsListService.getAppointmentAsList(), HttpStatus.ACCEPTED);
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
