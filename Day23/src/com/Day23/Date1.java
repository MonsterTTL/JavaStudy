package com.Day23;

import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		Date da = new Date();
		System.out.println(da);
		System.out.println(da.getTime());//��ȡ����ֵ
		da.setTime(1000000000);//���ú���ֵ
		System.out.println(da);
		Date da2 = new Date(0);//������촫��Ϊ�㣬Ϊ1970��  8����Ϊ������
		System.out.println(da2);
		
	}
}
 