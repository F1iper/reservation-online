package com.reservationonline.service.domain.entity;

import com.reservationonline.category.domain.entity.Category;
import com.reservationonline.appointment.domain.entity.Appointment;
import com.reservationonline.employee.domain.entity.Employee;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;
    private Boolean discount;
    private Integer length;

    @ManyToOne
    private Category category;

    @ManyToMany
    @JoinTable(name = "service_employee",
            joinColumns = @JoinColumn(name = "fk_service"),
            inverseJoinColumns = @JoinColumn(name = "fk_employee"))
    private Set<Employee> employees;

    @ManyToMany
    @JoinTable(name = "service_appointments",
            joinColumns = @JoinColumn(name = "fk_service"),
            inverseJoinColumns = @JoinColumn(name = "fk_appointment"))
    private Set<Appointment> appointments;


}
