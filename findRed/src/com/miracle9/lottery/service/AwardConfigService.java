package com.miracle9.lottery.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.miracle9.lottery.dao.BaseDao;
import com.miracle9.lottery.entity.AwardConfig;

@Service
public class AwardConfigService {
	/**
	 * 开奖时间
	 */
	public static Long awardTime;
	//public static AwardConfig config;
	
	Log log = LogFactory.getLog(getClass());
	
	public static List<AwardConfig> config =new ArrayList<>();

	@Autowired
	private BaseDao baseDao;

	public void loadAllConfig() {
		log.info("AwardConfigService开始执行了。。。。。。。。。。。。。。。。");
		Date now=new Date();
		List<AwardConfig> list = baseDao.getList(AwardConfig.class, "from AwardConfig");
		
		if (list.isEmpty()) {
			AwardConfig c ;
			c = new AwardConfig(10,"10:30:00",20, 90, 2);
			baseDao.add(c);
			list.add(c);
			c = new AwardConfig(5,"10:30:00",20, 90, 2);
			baseDao.add(c);
			list.add(c);
			c = new AwardConfig(1,"10:30:00",200, 90, 20);
			baseDao.add(c);
			list.add(c);
			c = new AwardConfig(10,"12:30:00",20, 30, 2);
			baseDao.add(c);
			list.add(c);
			c = new AwardConfig(5,"12:30:00",20, 30, 2);
			baseDao.add(c);
			list.add(c);
			c = new AwardConfig(1,"12:30:00",200, 30, 20);
			baseDao.add(c);
			list.add(c);
			c = new AwardConfig(10,"14:30:00",20, 90, 2);
			baseDao.add(c);
			list.add(c);
			c = new AwardConfig(5,"14:30:00",20, 90, 2);
			baseDao.add(c);
			list.add(c);
			c = new AwardConfig(1,"14:30:00",200, 90, 20);
			baseDao.add(c);
			list.add(c);
		}
		for(AwardConfig ac:list){
			awardTime=now.getTime();
			ac.setDayinterval(60*1000*ac.getHourNum()/(ac.getDayNum()/ac.getPerNum()));
			config.add(ac);
		}
	
	}
}
