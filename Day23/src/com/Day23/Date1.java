package com.Day23;

import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		Date da = new Date();
		System.out.println(da);
		System.out.println(da.getTime());//获取毫秒值
		da.setTime(1000000000);//设置毫秒值
		System.out.println(da);
		Date da2 = new Date(0);//如果构造传参为零，为1970年  8点因为东八区
		System.out.println(da2);
		
	}
}
 