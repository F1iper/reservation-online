package com.kamann.employee;


import com.kamann.client.entitiy.Address;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

  @Id
  @GeneratedValue
  private Long id;

  private String firstname;
  private String lastname;
  private String email;
  private String phoneNumber;

  @OneToOne
  private Address address;

}
