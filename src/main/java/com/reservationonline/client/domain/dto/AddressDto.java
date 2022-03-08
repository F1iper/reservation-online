package com.reservationonline.client.domain.dto;

import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDto {

    @Id
    private Long id;
    private Integer telephoneNumber;
    private String email;
    private String street;
    private String streetNumber;
    private String postalCode;
    private String city;

}
