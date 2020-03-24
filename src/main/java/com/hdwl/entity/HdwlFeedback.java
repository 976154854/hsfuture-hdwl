package com.hdwl.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

/**
 *@author wangdh
 *@description 反馈表实体
 *@date 2020/3/24
 *@param 
 *@return 
 */
@Entity
@Table(name="hdwl_feedback")
public class HdwlFeedback {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer corporateId;
  private String content;
  private LocalDateTime creatTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCorporateId() {
    return corporateId;
  }

  public void setCorporateId(Integer corporateId) {
    this.corporateId = corporateId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LocalDateTime getCreatTime() {
    return creatTime;
  }

  public void setCreatTime(LocalDateTime creatTime) {
    this.creatTime = creatTime;
  }

  public interface Insert {
  }

  public interface Update {
  }
}
