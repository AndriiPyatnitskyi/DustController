package com.example.demo.model;

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
public class DeviceInfo extends BaseEntity {

  private String description;
  private String ip;
  private String packetsSent;

  @Override
  public String toString() {
    return "DeviceInfo{" +
        "description='" + description + '\'' +
        ", ip='" + ip + '\'' +
        ", packetsSent='" + packetsSent + '\'' +
        ", id='" + id + '\'' +
        ", version=" + version +
        ", createdDate=" + createdDate +
        ", updatedDate=" + updatedDate +
        '}';
  }
}
