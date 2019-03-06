package com.example.demo.model;

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
public class Data {

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

}
