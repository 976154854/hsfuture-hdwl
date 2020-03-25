package com.hdwl.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *@author wangdh
 *@description 公司信息实体
 *@date 2020/3/24
 *@param 
 *@return 
 */
@Entity
@Table(name="hdwl_corporate")
public class HdwlCorporate implements Serializable {

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

  @Column(name = "create_time")
  private String createTime;

  @Column(name = "second")
  private Integer second;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCorporateName() {
    return corporateName;
  }

  public void setCorporateName(String corporateName) {
    this.corporateName = corporateName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getShareNumber() {
    return shareNumber;
  }

  public void setShareNumber(String shareNumber) {
    this.shareNumber = shareNumber;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public String getPictureOne() {
    return pictureOne;
  }

  public void setPictureOne(String pictureOne) {
    this.pictureOne = pictureOne;
  }

  public String getPictureTwo() {
    return pictureTwo;
  }

  public void setPictureTwo(String pictureTwo) {
    this.pictureTwo = pictureTwo;
  }

  public String getPictureThree() {
    return pictureThree;
  }

  public void setPictureThree(String pictureThree) {
    this.pictureThree = pictureThree;
  }

  public String getPictureFour() {
    return pictureFour;
  }

  public void setPictureFour(String pictureFour) {
    this.pictureFour = pictureFour;
  }

  public String getPictureFive() {
    return pictureFive;
  }

  public void setPictureFive(String pictureFive) {
    this.pictureFive = pictureFive;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public Integer getSecond() {
    return second;
  }

  public void setSecond(Integer second) {
    this.second = second;
  }

  public interface Insert {
  }

  public interface Update {
  }



}
