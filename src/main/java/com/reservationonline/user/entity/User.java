package com.reservationonline.user.entity;

import com.reservationonline.client.domain.entity.Client;
import lombok.Getter;
import lombok.Setter;

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
    private LocalDateTime createdAt;

    @OneToOne
    private Client client;

}
