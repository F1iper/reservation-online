package com.reservationonline.client.domain.entitty;

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

    @OneToOne(mappedBy = "address",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Client client;

}
