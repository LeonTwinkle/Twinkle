package com.miracle9.lottery.bean;

/**
 * 抽奖返回
 */
public class RedPacketResult extends Result {
	public int money;

	public RedPacketResult(int money, int success, String message) {
		super(success, message);
		this.money = money;
	}

}
