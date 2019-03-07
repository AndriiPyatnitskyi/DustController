package com.example.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class GasController extends BaseEntity {

  @Embedded
  private Data data;
  @Embedded
  private DeviceInfo deviceInfo;
  @Embedded
  private DeviceLocation deviceLocation;
  @Embedded
  private MessageInfo messageInfo;

}
