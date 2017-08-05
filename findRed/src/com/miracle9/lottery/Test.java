package com.miracle9.lottery;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.apache.log4j.Logger;

import com.miracle9.lottery.controller.RedPacketController;

public class Test {
	public static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
	private static final Logger logger = Logger
			.getLogger(Test.class);
	
	public static void main(String[] args) {
		//while (true) {\
		
			for (int i = 0; i < 1; i++) {
				MyThread m=new MyThread();
				m.setName(i+"");
				m.start();
			}
			
	}
}
