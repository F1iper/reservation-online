package com.reservationonline.employee.domain.entity;

import com.reservationonline.appointment.domain.entity.Appointment;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastname;
    private String login;
    private String email;
    private String password;

    //one to one -> USER
    //one to one -> ADDRESS
    //many to one -> CATEGORY
    //many to many -> SERVICE
    //many to many -> APPOINTMENT

}
