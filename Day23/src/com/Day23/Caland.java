package com.Day23;

import java.util.Calendar;

public class Caland {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));//获取年份
		System.out.println(cal.get(Calendar.MONTH));//获取月份，但是从零开始
		
	}

}
