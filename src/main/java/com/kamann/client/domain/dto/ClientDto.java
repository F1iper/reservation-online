package com.kamann.client.domain.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDto {

    private Long id;
    private String pesel;
    private String firstName;
    private String lastname;
    private String address;
    private String email;
    //todo: """java.lang.IllegalArgumentException: rawPassword cannot be null""" (how to handle that???)
    private String password;

}
