package com.miracle9.lottery;
import java.util.ArrayList;

import com.miracle9.lottery.utils.HttpUtil;

public class MyThread extends Thread {
	
	static ArrayList<String> codes=new ArrayList<String>();
	static {
//		codes.add("32RHkx7N24");
//		codes.add("46hDXkcI10");
//		codes.add("78NLaToe5");
//		codes.add("CZxs3aZP22");
//		codes.add("EAcObts718");
//		codes.add("Ex0egEmB4");
//		codes.add("f3X7Q5Os16");
//		codes.add("fQSYBMd63");
//		codes.add("H9Jy8kKI23");
//		codes.add("hPQiuhYd21");
//		codes.add("IQbQ2T4q29");
//		codes.add("Izux53Fw27");
//		codes.add("j8Xe1cuT26");
//		codes.add("kyOZH7qU15");
//		codes.add("mnaQV1pF12");
//		codes.add("NSNlkkUX14");
//		codes.add("oASo6dZv20");
//		codes.add("ojlZ8UWU2");
//		codes.add("p3IWa2uh28");
//		codes.add("p5tzmz4a13");
//		codes.add("PTcrPFeb7");
//		codes.add("QfUbbxgZ9");
//		codes.add("RWX1W02z11");
//		codes.add("skqWjkJY8");
//		codes.add("Tyeq6XL725");
//		codes.add("U0WaTPKj6");
//		codes.add("wPiDSpKK0");
//		codes.add("wyOSHSaf17");
//		codes.add("yLfQH5y819");
//		codes.add("ZgqV6o0l1");
		
		codes.add("polNfObx0");
		codes.add("ePLwBeV31");
		codes.add("mPPxBUr02");
		codes.add("zZKkKVnm3");
		codes.add("HwbNM2td4");
		codes.add("ATM4kRgM5");
		codes.add("md6D4PlQ6");
		codes.add("ms2LUB0G29");
		codes.add("QOIPCRu828");
		codes.add("Q37Bzn3C27");
		codes.add("m8Mboich26");
		codes.add("g22LE6NO25");
		codes.add("bfE9yEpZ24");
		codes.add("J3cHYRtA23");
		codes.add("70fFzdvl22");
		codes.add("1C3aoNGt21");
		codes.add("G3NyA8Gy20");
		codes.add("l9HSDl8U19");
		codes.add("6hTgYndw18");
		codes.add("PLLR24fe17");
		codes.add("3HYCYkWj16");
		codes.add("fK64jDXO15");
		codes.add("3sQ9L6UN14");
		codes.add("VKs58ceo13");
		codes.add("57QxqLF412");
		codes.add("IyXR0trs11");
		codes.add("OhUENkm010");
		codes.add("2WVhnxZM9");
		codes.add("fyf5oDZ28");
		codes.add("bnrtmZN77");
	}
	
	public void run() {
		String url = "http://139.224.47.209/findRed/findRed/getResult";
		
		int openId=100236;
		while(true){
			try {
//				sleep(100);
				if(openId>=100299)
					break;
				System.out.println("openId="+openId+"&code="+codes.get((int)(Math.random()*30)));
				String str = HttpUtil.sendPost(url, "openId="+openId+"&code="+codes.get((int)(Math.random()*30)));
				if(str.contains("-1")||str.contains("机会用完")||str.contains("money\":1")||str.contains("money\":5")||str.contains("money\":10"))
					openId++;
				if(str.contains("money\":10")||str.contains("money\":5")||str.contains("money\":1"))
					System.out.println(str);
				else
					System.out.println(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
    } 
}
