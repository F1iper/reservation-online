package com.kamann.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {

  private String firstname;
  private String lastname;
  private String phoneNumber;
  private String email;

}
