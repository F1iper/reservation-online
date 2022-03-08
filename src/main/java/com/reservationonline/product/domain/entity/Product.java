package com.reservationonline.product.domain.entity;

import com.reservationonline.appointment.domain.entity.Appointment;
import com.reservationonline.productCategory.domain.entity.ProductCategory;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    private Boolean discount;

    private Integer length;

    @ManyToOne
    @JoinColumn(name = "category_id")
    public ProductCategory productCategory;

    @ManyToOne
    @JoinColumn(name = "appointment_id")
    public Appointment appointment;

}
