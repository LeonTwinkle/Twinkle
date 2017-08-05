package com.miracle9.lottery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * 奖项配置
 */
@Entity
public class AwardConfig {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int money;
	private String startTime;
	private int hourNum;// 时段时长单位分钟
	private int dayNum;//时段开奖数目
	private int perNum;//每次多少个
	
	@Transient
	private long dayinterval;// 开奖间隔毫秒
	@Transient
	private long time;// 上次奖项开出时间

	public AwardConfig() {
	}

	public AwardConfig(int money, String startTime,int dayNum, int hourNum,int perNum) {
		this.money = money;
		this.dayNum = dayNum;
		this.hourNum = hourNum;
		this.startTime=startTime;
		this.perNum=perNum;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHourNum() {
		return hourNum;
	}

	public void setHourNum(int hourNum) {
		this.hourNum = hourNum;
	}

	public int getDayNum() {
		return dayNum;
	}

	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}

	public long getDayinterval() {
		return dayinterval;
	}

	public void setDayinterval(long dayinterval) {
		this.dayinterval = dayinterval;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPerNum() {
		return perNum;
	}

	public void setPerNum(int perNum) {
		this.perNum = perNum;
	}

	
	
}
