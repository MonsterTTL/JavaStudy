package com.Day23;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SIMdateFor {
	public static void main(String[] args) throws ParseException {
		DateFormat df ;//�����࣬����ʵ����
		DateFormat df1 = DateFormat.getDateInstance();//��������������󣬷����������
		
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sdf.format(d1));//�����ڶ���ת��Ϊ�ַ���
		
		//���ַ���ת��Ϊ���ڶ���
		String str = "2003��01��16�� 08:08:08";
		Date e =  sdf.parse(str);
		System.out.println(e);
		
	}

}
