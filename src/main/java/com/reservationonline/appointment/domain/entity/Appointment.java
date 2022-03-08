package com.reservationonline.appointment.domain.entity;

import com.reservationonline.product.domain.entity.Product;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
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

    private LocalDate date;

    @OneToMany(mappedBy = "appointment")
    public Set<Product> products;

}
