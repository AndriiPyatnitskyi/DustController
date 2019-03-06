package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GasController extends BaseEntity {

  @OneToOne
  private Data data;
  @OneToOne
  private DeviceInfo deviceInfo;
  @OneToOne
  private DeviceLocation deviceLocation;
  @OneToOne
  private MessageInfo messageInfo;

  @Override
  public String toString() {
    return "GasController{" +
        "data=" + data +
        ", deviceInfo=" + deviceInfo +
        ", deviceLocation=" + deviceLocation +
        ", messageInfo=" + messageInfo +
        ", id='" + id + '\'' +
        ", version=" + version +
        ", createdDate=" + createdDate +
        ", updatedDate=" + updatedDate +
        '}';
  }
}
