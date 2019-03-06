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
public class Data extends BaseEntity {

  private Long lifeTime;
  private boolean state;
  private Long pm1;
  private Long pm25;
  private Long pm10;
  private Long fpm1;
  private Long fpm25;
  private Long fpm10;
  private Long pnum03;
  private Long pnum05;
  private Long pnum1;
  private Long pnum25;
  private Long pnum5;
  private Long pnum10;
  private Long temperature;
  private Long humidity;
  private Long pressure;
  private Long ozoneHigh;
  private Long ozoneLow;
  private Integer co;
  private Integer no;
  private Integer no2;
  private Integer h2s;
  private Integer so2;
  private Integer c6h6;

  @Override
  public String toString() {
    return "Data{" +
        "lifeTime=" + lifeTime +
        ", state=" + state +
        ", pm1=" + pm1 +
        ", pm25=" + pm25 +
        ", pm10=" + pm10 +
        ", fpm1=" + fpm1 +
        ", fpm25=" + fpm25 +
        ", fpm10=" + fpm10 +
        ", pnum03=" + pnum03 +
        ", pnum05=" + pnum05 +
        ", pnum1=" + pnum1 +
        ", pnum25=" + pnum25 +
        ", pnum5=" + pnum5 +
        ", pnum10=" + pnum10 +
        ", temperature=" + temperature +
        ", humidity=" + humidity +
        ", pressure=" + pressure +
        ", ozoneHigh=" + ozoneHigh +
        ", ozoneLow=" + ozoneLow +
        ", co=" + co +
        ", no=" + no +
        ", no2=" + no2 +
        ", h2s=" + h2s +
        ", so2=" + so2 +
        ", c6h6=" + c6h6 +
        '}';
  }
}
