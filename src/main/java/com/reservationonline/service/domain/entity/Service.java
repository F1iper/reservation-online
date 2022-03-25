package com.reservationonline.service.domain.entity;

import com.reservationonline.appointment.domain.entity.Appointment;
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

    @ManyToMany
    private Set<Appointment> appointments;

    @ManyToOne
    private Category
    //many to many -> APPOINTMENT
    //many to one -> CATEGORY
    //mane to many -> EMPLOYEE


}
