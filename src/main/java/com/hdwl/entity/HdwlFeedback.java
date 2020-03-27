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
@Data
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

  @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  @Column(name = "creat_time")
  private Date creatTime;

  @Column(name = "phone")
  private String phone;

  public interface Insert {
  }

  public interface Update {
  }
}
