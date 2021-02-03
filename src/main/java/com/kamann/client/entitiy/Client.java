package com.kamann.client.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "clients")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String firstname;
  private String lastname;
  private String phoneNumber;
  private String email;

  @OneToOne
  private Address address;


}
