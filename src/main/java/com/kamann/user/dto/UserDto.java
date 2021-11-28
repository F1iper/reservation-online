package com.kamann.user.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private UUID id;

    @NotNull
    private String pesel;

    @NotNull(message = "You have to enter the name")
    private String firstName;

    @NotNull
    private String lastname;

    @NotNull
    private String address;

    @Email(message = "Invalid email")
    @NotNull
    private String email;

    @NotNull
    private String password;

}
