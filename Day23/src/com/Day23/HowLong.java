package com.Day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HowLong {
	public static void main(String[] args) throws ParseException {
			String birthday = "2003��01��16��";
			String target = "2030��01��16��";
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
			
			Date d1 = sdf.parse(target);
			Date d2 = sdf.parse(birthday);
			long time = d1.getTime() - d2.getTime();
			System.out.println("�һ���" + (time/1000/60/60/24) +" ��");
	}

}
