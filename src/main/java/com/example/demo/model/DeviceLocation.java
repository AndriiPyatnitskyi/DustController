package com.example.demo.model;

import java.math.BigDecimal;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
@ToString
public class DeviceLocation {

  private String descriptiveLocation;
  private BigDecimal latitudeSet;
  private BigDecimal longtitudeSet;
  private BigDecimal altitudeSet;

}
