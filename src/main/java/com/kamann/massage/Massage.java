package com.kamann.massage;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Massage {

  @Id
  @GeneratedValue
  private Long id;

  private String serviceName;
  private BigDecimal servicePrice;

//  @OneToMany
//  private List<Staff> possibleStaff;

  private int length;


}
