package com.Day23;

import java.util.Calendar;

public class Caland {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));//��ȡ���
		System.out.println(cal.get(Calendar.MONTH));//��ȡ�·ݣ����Ǵ��㿪ʼ
		
		cal.add(Calendar.YEAR, 1);//����Ϊʱ������ƣ�����Ϊǰ��
		//cal.set(0, 0);����ʱ���ֶ�
		System.out.println(cal.get(Calendar.YEAR));
		
	}

}
