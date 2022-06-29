package com.Day31;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {
	public static void main(String[] args) throws InterruptedException {
		Timer s1 = new Timer();
		s1.schedule(new MyTimerTask(), new Date(122,5,29,14,45,30),10000);
		//��ʱ���࣬��ָ��ʱ�䰲��ָ������
		//��һ�������ǰ��ŵ����񣬵ڶ���������ִ�е�ʱ��
		while(true)
		{
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}
}


class MyTimerTask extends TimerTask{
	public void run(){
		System.out.println("��");
	}

}
