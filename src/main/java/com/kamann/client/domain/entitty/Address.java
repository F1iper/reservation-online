package com.kamann.client.domain.entitty;

import lombok.*;
import org.springframework.lang.Nullable;

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
    @Nullable
    private Integer telephoneNumber;

    private String email;
    @Nullable
    private String street;
    @Nullable
    private String streetNumber;
    @Nullable
    private String postalCode;
    @Nullable
    private String city;

    @OneToOne(mappedBy = "address",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private Client client;

}
