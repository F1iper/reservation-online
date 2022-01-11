package com.kamann.appointment.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //todo: auto (?)
    private Long id;

    private String name;

    private LocalDate date;

    //todo: one to one -> user
    // one to many -> product (?) one appointment with many products ?

}
