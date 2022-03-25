package com.reservationonline.client.domain.entity;

import com.reservationonline.appointment.domain.entity.Appointment;
import com.reservationonline.client.domain.enums.Status;
import com.reservationonline.user.entity.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

    @OneToMany
    @JoinColumn(name = "client_id")
    private Set<Appointment> appointments;

    @OneToOne(mappedBy = "client")
    private Address address;

    @OneToMany(mappedBy = "client")
    private Set<History> histories;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;

}
