package com.reservationonline.service.domain.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private Boolean discount;
    private Integer length;
    //todo Cannot input category in mysql request: "private ProductCategory productCategory;"

}
