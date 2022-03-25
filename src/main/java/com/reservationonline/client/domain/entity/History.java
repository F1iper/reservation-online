package com.reservationonline.client.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private LocalDateTime assignedAt;
    private LocalDateTime visitedAt;
    private String other;

    @ManyToOne
    private Client client;
}
