package com.Day23;

import java.util.Calendar;

public class Caland {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));//获取年份
		System.out.println(cal.get(Calendar.MONTH));//获取月份，但是从零开始
		
		cal.add(Calendar.YEAR, 1);//正数为时间向后移，负数为前移
		//cal.set(0, 0);设置时间字段
		System.out.println(cal.get(Calendar.YEAR));
		
	}

}
