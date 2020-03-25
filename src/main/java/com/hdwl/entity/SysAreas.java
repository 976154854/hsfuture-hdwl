package com.hdwl.entity;

import javax.persistence.*;

@Entity
@Table(name="sys_areas")
public class SysAreas {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "areaid")
  private String areaid;
  @Column(name = "area")
  private String area;
  @Column(name = "cityid")
  private String cityid;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAreaid() {
    return areaid;
  }

  public void setAreaid(String areaid) {
    this.areaid = areaid;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getCityid() {
    return cityid;
  }

  public void setCityid(String cityid) {
    this.cityid = cityid;
  }
}
