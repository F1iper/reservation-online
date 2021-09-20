package com.kamann.user.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;

    //    @JsonIgnore
    //    private Long pId;

    private String pesel;

    private String name;

    private String lastname;

    private String address;

    private String email;

    private String password;
}
