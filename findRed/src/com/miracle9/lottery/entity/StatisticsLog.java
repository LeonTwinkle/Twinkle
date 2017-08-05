package com.miracle9.lottery.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class StatisticsLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	@Column(nullable = false)
	private String openId;
	private Date clickDate;
	private String city;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getClickDate() {
		return clickDate;
	}
	public void setClickDate(Date clickDate) {
		this.clickDate = clickDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	

}
