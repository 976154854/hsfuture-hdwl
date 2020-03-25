package com.hdwl.entity;


import javax.persistence.*;
import java.sql.Date;
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
  @Column(name = "id")
  private Integer id;

  @Column(name = "corporate_id")
  private Integer corporateId;

  @Column(name = "content")
  private String content;

  @Column(name = "creat_time")
  private Date creatTime;

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

  public Date getCreatTime() {
    return creatTime;
  }

  public void setCreatTime(Date creatTime) {
    this.creatTime = creatTime;
  }

  public interface Insert {
  }

  public interface Update {
  }
}
