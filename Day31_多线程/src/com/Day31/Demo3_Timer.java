package com.Day31;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {
	public static void main(String[] args) throws InterruptedException {
		Timer s1 = new Timer();
		s1.schedule(new MyTimerTask(), new Date(122,5,29,14,45,30),10000);
		//计时器类，在指定时间安排指定任务
		//第一个参数是安排的任务，第二个参数是执行的时间
		while(true)
		{
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}
}


class MyTimerTask extends TimerTask{
	public void run(){
		System.out.println("起床");
	}

}
