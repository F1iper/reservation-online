package com.kamann.client.entitiy;

import com.kamann.employee.Employee;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String cityName;
  private String streetName;
  private String streetNumber;
  private int local;
  private String postalCode;

  @OneToOne(mappedBy = "address")
  private Client client;

  @OneToOne(mappedBy = "address")
  private Employee employee;

}
