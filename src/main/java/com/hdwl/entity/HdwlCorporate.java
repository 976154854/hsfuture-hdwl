package com.hdwl.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 *@author wangdh
 *@description 公司信息实体
 *@date 2020/3/24
 *@param 
 *@return 
 */
@Data
@Entity
@Table(name="hdwl_corporate")
public class HdwlCorporate{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "corporate_name")
  private String corporateName;

  @Column(name = "user_name")
  private String userName;

  @Column(name = "phone")
  private String phone;

  @Column(name = "number")
  private String number;

  @Column(name = "share_number")
  private String shareNumber;

  @Column(name = "start_time")
  private String startTime;

  @Column(name = "end_time")
  private String endTime;

  @Column(name = "province")
  private String province;

  @Column(name = "city")
  private String city;

  @Column(name = "county")
  private String county;

  @Column(name = "address")
  private String address;

  @Column(name = "profile")
  private String profile;

  @Column(name = "license")
  private String license;

  @Column(name = "picture_one")
  private String pictureOne;

  @Column(name = "picture_two")
  private String pictureTwo;

  @Column(name = "picture_three")
  private String pictureThree;

  @Column(name = "picture_four")
  private String pictureFour;

  @Column(name = "picture_five")
  private String pictureFive;

  @Column(name = "video")
  private String video;

  @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  @Column(name = "create_time")
  private Date createTime;

  @Column(name = "second")
  private Integer second;

  public interface Insert {
  }

  public interface Update {
  }



}
