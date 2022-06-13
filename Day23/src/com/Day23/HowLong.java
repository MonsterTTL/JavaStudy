package com.Day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HowLong {
	public static void main(String[] args) throws ParseException {
			String birthday = "2003年01月16日";
			String target = "2030年01月16日";
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
			
			Date d1 = sdf.parse(target);
			Date d2 = sdf.parse(birthday);
			long time = d1.getTime() - d2.getTime();
			System.out.println("我活了" + (time/1000/60/60/24) +" 天");
	}

}
