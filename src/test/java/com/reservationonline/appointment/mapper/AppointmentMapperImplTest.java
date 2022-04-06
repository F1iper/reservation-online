package com.reservationonline.appointment.mapper;

import com.reservationonline.appointment.domain.dto.AppointmentDto;
import com.reservationonline.appointment.domain.entity.Appointment;
import com.reservationonline.appointment.domain.enums.Payment;
import com.reservationonline.appointment.domain.mapper.AppointmentMapper;
import com.reservationonline.appointment.domain.mapper.impl.AppointmentMapperImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppointmentMapperImplTest {

    private static AppointmentMapper mapper;

    @BeforeAll
    static void setUp() {
        mapper = new AppointmentMapperImpl(new ModelMapper());
    }

    @Test
    void shouldMapAppointmentToAppointmentDto() {
        //given
        final Appointment underTest = Appointment.builder()
                .id(1L)
                .paymentStatus(Payment.APPROVED)
                .date(LocalDateTime.of(2022, 5, 12, 16, 30))
                .description("Back massage")
                .build();

        //when
        final AppointmentDto underTestDto = mapper.appointmentToAppointmentDto(underTest);

        //then
        assertAll(() -> {
            assertEquals(underTest.getId(), underTestDto.getId());
            assertEquals(underTest.getPaymentStatus(), underTestDto.getPaymentStatus());
            assertEquals(underTest.getDate(), underTestDto.getDate());
            assertEquals(underTest.getDescription(), underTestDto.getDescription());
        });
    }

    @Test
    void shouldMapAppointmentDtoToAppointment() {
        //given
        final AppointmentDto underTest = AppointmentDto.builder()
                .id(2L)
                .paymentStatus(Payment.PENDING)
                .description("Rollercoaster")
                .date(LocalDateTime.of(2022, 4, 22, 9, 30))
                .build();

        //when
        final Appointment underTestDto = mapper.appointmentDtoToAppointment(underTest);

        //then
        assertAll(() -> {
            assertEquals(underTest.getId(), underTestDto.getId());
            assertEquals(underTest.getPaymentStatus(), underTestDto.getPaymentStatus());
            assertEquals(underTest.getDescription(), underTestDto.getDescription());
            assertEquals(underTest.getDate(), underTestDto.getDate());
        });

    }
}