package com.kamann.client.domain.entitty;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Nullable
    private String firstName;
    @Nullable
    private String lastname;
    @Nullable
    private Date createdAt;
    @Nullable
    private String password;
    @Nullable
    private String pesel;
    @Nullable
    private String sex;

    @OneToOne
    private Address address;

}
