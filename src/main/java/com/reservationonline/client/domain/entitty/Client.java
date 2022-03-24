package com.reservationonline.client.domain.entitty;

import com.reservationonline.client.domain.enums.Status;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastname;
    private Date createdAt;
    private String password;
    private String pesel;
    private String sex;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    private Address address;

}
