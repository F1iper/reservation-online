package com.kamann.appointment.controller;

import com.kamann.appointment.dto.AppointmentDto;
import com.kamann.appointment.service.CreateAppointmentService;
import com.kamann.appointment.service.GetAppointmentAsListService;
import com.kamann.appointment.service.GetAppointmentByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
public class AppointmentController {

    private final CreateAppointmentService createAppointmentService;
    private final GetAppointmentByIdService getAppointmentByIdService;
    private final GetAppointmentAsListService getAppointmentAsListService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED) //todo: handle exception if body = null
    public AppointmentDto createAppointment(@RequestBody AppointmentDto appointmentDto) {
        return createAppointmentService.createAppointment(appointmentDto);
    }

    @GetMapping("/{id}")
    public AppointmentDto getAppointmentById(@PathVariable Long id) {
        return getAppointmentByIdService.getAppointmentById(id);
    }

    @GetMapping
    public List<AppointmentDto> getAppointmentAsList() {
        return getAppointmentAsListService.getAppointmentAsList();
    }
}
