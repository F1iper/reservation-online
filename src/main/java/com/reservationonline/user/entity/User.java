package com.reservationonline.user.entity;

import com.reservationonline.client.domain.entity.Client;
import com.reservationonline.employee.domain.entity.Employee;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String password;
    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    @MapsId
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    private Employee employee;

}
