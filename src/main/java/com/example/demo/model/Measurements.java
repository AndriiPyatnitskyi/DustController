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
public class Measurements {

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
  private Long ozoneHigh_ppm;
  private Long ozoneLow_ppb;
  private Long co_ppm;
  private Long no_ppm;
  private Long no2_ppm;
  private Long so2_ppm;
  private Long h2s_ppm;
  private Long c6h6_ppm;
  private Long ozoneHigh_mg;
  private Long ozoneLow_mg;
  private Long co_mg;
  private Long no_mg;
  private Long no2_mg;
  private Long so2_mg;
  private Long h2s_mg;
  private Long c6h6_mg;

}
