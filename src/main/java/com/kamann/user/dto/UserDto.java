package com.kamann.user.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    @NotNull
    @NotEmpty
    private Long id;

    @NotNull
    private String pesel;

    @NotNull(message = "You have to enter the name")
    private String firstName;

    @NotNull
    private String lastname;

    @NotNull
    private String address;

    //todo: fix regex (?) debug that!
    @Email(message = "Please provide a valid email address", regexp = ".+@.+\\..+")
    @NotNull
    private String email;

    @NotNull
    private String password;

}
