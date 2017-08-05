package com.miracle9.lottery;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.miracle9.lottery.controller.RedPacketController;
import com.miracle9.lottery.entity.AwardConfig;
import com.miracle9.lottery.service.AwardConfigService;
import com.miracle9.lottery.service.LotteryCodeService;

/**
 * 抽奖控制器
 */
@Component
@Scope("singleton")
public class GameController {
	private static final Logger logger = Logger
			.getLogger(GameController.class);
	@Autowired
	private AwardConfigService awardConfigService;
	/**
	 * 获取出奖金额
	 * 
	 * @return int
	 */
	public static SimpleDateFormat timetran = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static SimpleDateFormat daytran = new SimpleDateFormat("yyyy-MM-dd ");
	
	public synchronized int draw(String code) {
		
		int money=0;
		Long now=System.currentTimeMillis();
//		if(!LotteryCodeService.codes.contains(code))
//			return 0;
//		boolean flagee=false;
//		for(AwardConfig ac:AwardConfigService.config){
//			try {Date acTime;
//				acTime = timetran.parse(daytran.format(new Date())+ac.getStartTime());
//				if(acTime.getTime()<now
//					&&  now -acTime.getTime()<ac.getHourNum()*60*1000 
//					&& ac.getDayNum()>0){
//					flagee=true;
//					if(now-AwardConfigService.awardTime>ac.getDayinterval()){
//						
//						logger.info("---------");
//						awardConfigService.loadAllConfig();
//						LotteryCodeService.createLotterys();
//						AwardConfigService.awardTime=now;
//					}
//				}
//			
//				} catch (ParseException e) {
//				e.printStackTrace();
//			}
//		}
//		if(!flagee)
//			return 0;
//		
//		
//		int i=0;
//		for(String s:LotteryCodeService.codes){
//			
//			if(s.equals(code)){
//				break;
//			}
//			i++;
//		}
//		
//		
//		if(LotteryCodeService.lottery.keySet().contains(i)){
//			synchronized(LotteryCodeService.lottery){
//				if(LotteryCodeService.lottery.get(i)!=null && LotteryCodeService.lottery.get(i)>0){
//					
//					LotteryCodeService.lottery.put(i,0);
//				}
//				else
//					return 0;
//			}
//		}else{
//			return 0;
//		}
//		logger.info("----"+i);
//		
		ArrayList<AwardConfig> newAy=new ArrayList<AwardConfig>();
		for(AwardConfig a:AwardConfigService.config){
			newAy.add(a);
		}
		try{while(true){
			int size=newAy.size();
			if(size<=0)
				break;
			int random=(int) Math.floor((Math.random()*size));
			logger.info(""+this.toString()+size+"+++++++++++random"+random);
			AwardConfig ac=newAy.get(random);
			Date acTime=timetran.parse(daytran.format(new Date())+ac.getStartTime());
			if(ac.getMoney()==66){
				Long t=ac.getHourNum()*60*1000+acTime.getTime()-now;
				if(Math.random()*t>t-1000*60){
					boolean flage=false;
					synchronized(AwardConfigService.config){
						if(AwardConfigService.config.get(random).getDayNum()>0){
							AwardConfigService.config.get(random).setDayNum(0);
							flage=true;
						}	
					}
					if(flage){
						return 66;
					}
					
				}else if(t<1000*60*60*3){
					boolean flage=false;
					synchronized(AwardConfigService.config){
						if(AwardConfigService.config.get(random).getDayNum()>0){
							AwardConfigService.config.get(random).setDayNum(0);
							flage=true;
						}	
					}
					if(flage){
						return 66;
					}
				}
			}
			
			
			
			
			if(acTime.getTime()<now
					&&  now -acTime.getTime()<ac.getHourNum()*60*1000 
					&& ac.getDayNum()>0){
				
				logger.info(ac.getDayinterval()+"+++++"+acTime);
				AwardConfig con=null;
				for(AwardConfig a:AwardConfigService.config) {
					if(a.equals(ac))
						con=a;
						
				}
				synchronized(AwardConfigService.config){
						
							con.setDayNum(con.getDayNum()-1);
							money=ac.getMoney();
							logger.info(con.getDayNum());
						
					}
					
				
				return money;
				
			}
			newAy.remove(random);
		}
			
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		


		
		
		return money;
		
	}

}
