package com.reservationonline.appointment.domain.entity;

import com.reservationonline.appointment.domain.enums.Payment;
import com.reservationonline.client.domain.entity.Client;
import com.reservationonline.employee.domain.entity.Employee;
import com.reservationonline.service.domain.entity.Service;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private Payment paymentStatus;

    @ManyToOne
    private Client client;

    @ManyToMany
    @JoinTable(name = "appointment_employee",
            joinColumns = @JoinColumn(name = "fk_appointment"),
            inverseJoinColumns = @JoinColumn(name = "fk_employee"))
    private Set<Employee> employees;

    @ManyToMany(mappedBy = "appointments")
    private Set<Service> services;

}
