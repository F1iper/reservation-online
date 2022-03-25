package com.reservationonline.client.domain.entity;

import com.reservationonline.employee.domain.entity.Employee;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer telephoneNumber;
    private String email;
    private String street;
    private String streetNumber;
    private String postalCode;
    private String city;

    @OneToOne
    private Client client;

    @OneToOne
    private Employee employee;

}

