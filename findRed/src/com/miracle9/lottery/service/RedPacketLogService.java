package com.miracle9.lottery.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle9.lottery.dao.BaseDao;
import com.miracle9.lottery.entity.RedPacketLog;

@Service
public class RedPacketLogService {
	
	@Autowired
	private BaseDao baseDao;

	public void add(RedPacketLog log) {
		baseDao.add(log);
	}

	public void update(RedPacketLog log) {
		baseDao.update(log);
	}

	public List<RedPacketLog> getAll() {
		return baseDao.getList(RedPacketLog.class, "from RedPacketLog where isSend = false");
	}
	
	public int getCount(String openId){
		return baseDao.getCount("select count(*) from RedPacketLog where openId = ?", openId);
	}
}
