package com.hdwl.entity;


import javax.persistence.*;
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
public class HdwlCorporate {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String corporateName;
  private String userName;
  private String phone;
  private String number;
  private String shareNumber;
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private String province;
  private String city;
  private String county;
  private String address;
  private String profile;
  private String license;
  private String pictureOne;
  private String pictureTwo;
  private String pictureThree;
  private String pictureFour;
  private String pictureFive;
  private String video;
  private java.sql.Timestamp createTime;
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

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDateTime endTime) {
    this.endTime = endTime;
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

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
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
