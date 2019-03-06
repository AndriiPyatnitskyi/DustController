package com.example.demo.model;

import java.time.Instant;
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
public class MessageInfo extends BaseEntity {

  private Integer messageId;
  private String messageDateTime;
  private String requestHash;

  @Override
  public String toString() {
    return "MessageInfo{" +
        "messageId=" + messageId +
        ", messageDateTime='" + messageDateTime + '\'' +
        ", requestHash='" + requestHash + '\'' +
        ", id='" + id + '\'' +
        ", version=" + version +
        ", createdDate=" + createdDate +
        ", updatedDate=" + updatedDate +
        '}';
  }
}
