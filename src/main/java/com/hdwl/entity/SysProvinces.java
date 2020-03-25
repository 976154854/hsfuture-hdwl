package com.hdwl.entity;

import javax.persistence.*;

@Entity
@Table(name="sys_provinces")
public class SysProvinces {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "provinceid")
  private String provinceid;

  @Column(name = "province")
  private String province;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getProvinceid() {
    return provinceid;
  }

  public void setProvinceid(String provinceid) {
    this.provinceid = provinceid;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }
}
