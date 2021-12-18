package com.kamann.client.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDto {

    @NotEmpty
    private Long id;

    private String pesel;

    private String firstName;

    private String lastname;

    @NotEmpty
    private String address;

    @NotEmpty
    private String email;

    //todo: """java.lang.IllegalArgumentException: rawPassword cannot be null""" (how to handle that???)
    @NotEmpty
    private String password;

}
