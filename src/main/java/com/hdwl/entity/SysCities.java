package com.hdwl.entity;

import javax.persistence.*;

@Entity
@Table(name="sys_cities")
public class SysCities {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "cityid")
  private String cityid;

  @Column(name = "city")
  private String city;

  @Column(name = "provinceid")
  private String provinceid;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCityid() {
    return cityid;
  }

  public void setCityid(String cityid) {
    this.cityid = cityid;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvinceid() {
    return provinceid;
  }

  public void setProvinceid(String provinceid) {
    this.provinceid = provinceid;
  }
}
