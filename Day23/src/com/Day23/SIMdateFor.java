package com.Day23;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SIMdateFor {
	public static void main(String[] args) throws ParseException {
		DateFormat df ;//抽象类，不能实例化
		DateFormat df1 = DateFormat.getDateInstance();//父类引用子类对象，返回子类对象
		
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d1));//将日期对象转换为字符串
		
		//将字符串转换为日期对象
		String str = "2003年01月16日 08:08:08";
		Date e =  sdf.parse(str);
		System.out.println(e);
		
	}

}
