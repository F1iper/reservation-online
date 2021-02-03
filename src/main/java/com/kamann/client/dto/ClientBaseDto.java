package com.kamann.client.dto;

import com.kamann.client.entitiy.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientBaseDto {

  private String firstname;
  private String lastname;
  private String phoneNumber;
  private String email;

  private Address address;

}
