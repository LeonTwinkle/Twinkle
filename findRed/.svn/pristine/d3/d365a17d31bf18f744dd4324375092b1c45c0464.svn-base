package com.miracle9.lottery.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.miracle9.lottery.dao.BaseDao;
import com.miracle9.lottery.entity.AwardConfig;

public class TimeService {
	
	
	@Autowired
	private BaseDao baseDao;
	Log log = LogFactory.getLog(getClass());
	
	
	public void time(){
		log.info("AwardConfigService开始执行了。。。。。。。。。。。。。。。。");
		Date now=new Date();
		List<AwardConfig> list = baseDao.getList(AwardConfig.class, "from AwardConfig");
		for(AwardConfig ac:list){
			AwardConfigService.awardTime=now.getTime();
			ac.setDayinterval(60*1000*ac.getHourNum()/(ac.getDayNum()/ac.getPerNum()));
			AwardConfigService.config.add(ac);
		}
	}

}
