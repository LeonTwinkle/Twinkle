package com.miracle9.lottery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle9.lottery.dao.BaseDao;
import com.miracle9.lottery.entity.StatisticsLog;
@Service
public class StaticsLogService {

	
	@Autowired
	private BaseDao baseDao;

	public void add(StatisticsLog log) {
		baseDao.add(log);
	}



	public void update(StatisticsLog log) {
		baseDao.update(log);
	}
}
