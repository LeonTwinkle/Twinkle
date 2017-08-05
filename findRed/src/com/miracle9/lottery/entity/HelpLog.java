package com.miracle9.lottery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HelpLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private String userOpenId;
	@Column(nullable = false, unique = true)
	private String fiendOpenId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserOpenId() {
		return userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}
	public String getFiendOpenId() {
		return fiendOpenId;
	}
	public void setFiendOpenId(String fiendOpenId) {
		this.fiendOpenId = fiendOpenId;
	}
}
