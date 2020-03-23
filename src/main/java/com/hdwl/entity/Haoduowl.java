package com.hdwl.entity;

import javax.persistence.*;

/**
 * 学生信息实体
 * @author Administrator
 *
 */

@Entity
@Table(name="hdwl")
public class Haoduowl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "sex")
	private Integer sex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public interface Insert {
	}

	public interface Update {
	}
}
