package com.reservationonline.employee.domain.entity;

import com.reservationonline.appointment.domain.entity.Appointment;
import com.reservationonline.client.domain.entity.Address;
import com.reservationonline.service.domain.entity.Service;
import com.reservationonline.user.User;
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

    @OneToOne
    private User user;

    @OneToOne
    private Address address;

    @ManyToMany(mappedBy = "employees")
    private Set<Appointment> appointment;

    @ManyToMany(mappedBy = "employees")
    private Set<Service> service;

}
