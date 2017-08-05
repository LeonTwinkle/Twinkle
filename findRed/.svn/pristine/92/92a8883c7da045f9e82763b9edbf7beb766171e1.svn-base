package com.miracle9.lottery.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.miracle9.lottery.dao.BaseDao;
import com.miracle9.lottery.entity.LotteryCode;
import com.miracle9.lottery.utils.MyUtil;


public class LotteryCodeService {
	public static ArrayList<String> codes=new ArrayList<String>();//所有二维码
	public static Map<Integer,Integer> lottery=new HashMap<>();//中奖二维码号码及剩余个数
	@Autowired
	private BaseDao baseDao;
	private static int codeNum;
	private static final Logger logger = Logger
			.getLogger(LotteryCodeService.class);
	public static Date nowtime;
	public void loadAllConfig() {
		List<LotteryCode> list = baseDao.getList(LotteryCode.class, "from LotteryCode");
		if (list.isEmpty()) {
			
			for(int i=0;i<30;i++){
				LotteryCode code=new LotteryCode();
				code.setId(i);
				code.setCode(""+MyUtil.getStr(8)+i);
				baseDao.add(code);
				list.add(code);
				codes.add(code.getCode());
			}
			
		}
		for(LotteryCode code:list){
			codes.add(code.getCode());
		}
		createLotterys();
		nowtime=new Date();
		
	}
	
	public static void createLotterys(){
		
		lottery=new HashMap<>();
		List<String> list =codes;
		System.out.println(list.size());
		
		for(int i=0;i<codeNum;i++){
			int random;
			do{
				random=(int) (30*Math.random());
			}while(lottery.containsKey(random));
			logger.info(list.get(random));
			lottery.put(random,1);
			
		}
	}

	public static int getCodeNum() {
		return codeNum;
	}

	public static void setCodeNum(int codeNum) {
		LotteryCodeService.codeNum = codeNum;
		
	}
}
