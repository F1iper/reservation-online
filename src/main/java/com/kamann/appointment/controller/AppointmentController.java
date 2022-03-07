package com.kamann.appointment.controller;

import com.kamann.appointment.domain.dto.AppointmentDto;
import com.kamann.appointment.domain.service.AppointmentAsListService;
import com.kamann.appointment.domain.service.AppointmentAddService;
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

    private final AppointmentGetByIdService getByIdService;
    private final AppointmentAsListService getAsListService;
    private final AppointmentAddService addService;
    private final AppointmentDeleteService deleteService;

    @GetMapping("/{id}")
    public ResponseEntity<AppointmentDto> getAppointmentById(@PathVariable Long id) {
        if(getByIdService.existsByID(id))
            return new ResponseEntity<>(getByIdService.getById(id), HttpStatus.FOUND);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> getAppointments() {
        if(getAsListService.getAsList().isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(getAsListService.getAsList(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<AppointmentDto> createAppointment(@RequestBody AppointmentDto dto) {
        return new ResponseEntity<>(addService.create(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AppointmentDto> deleteAppointment(@PathVariable Long id) {
        if (deleteService.removeIfIdExists(id)) {
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping
    public ResponseEntity<AppointmentDto> deleteAllAppointments(){
        if(deleteService.appointmentListIsEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
