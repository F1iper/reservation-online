package com.reservationonline.client.domain.dto;

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
    //todo: password cannot be null because its getting encoded before persist to DB
    private String password;

}
