package com.example.demo.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DeviceLocation extends BaseEntity {

  private String descriptiveLocation;
  private BigDecimal latitudeSet;
  private BigDecimal longtitudeSet;
  private BigDecimal altitudeSet;

  @Override
  public String toString() {
    return "DeviceLocation{" +
        "descriptiveLocation='" + descriptiveLocation + '\'' +
        ", latitudeSet=" + latitudeSet +
        ", longtitudeSet=" + longtitudeSet +
        ", altitudeSet=" + altitudeSet +
        ", id='" + id + '\'' +
        ", version=" + version +
        ", createdDate=" + createdDate +
        ", updatedDate=" + updatedDate +
        '}';
  }
}
