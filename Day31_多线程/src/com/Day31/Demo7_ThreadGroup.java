package com.Day31;

public class Demo7_ThreadGroup {
	public static void main(String[] args) {
//		demo1();
		ThreadGroup tg  = new ThreadGroup("我是你爸爸");
		MyRunnable mr  = new MyRunnable();
		Thread t1 = new Thread(tg,mr,"霸霸");
		Thread t2 = new Thread(tg,mr,"李四");
		
		System.out.println(t1.getThreadGroup().getName()); // 获取组名
		System.out.println(t2.getThreadGroup().getName());
		
		tg.setDaemon(true);
	}

	private static void demo1() {
		Thread t1 = new Thread(new MyRunnable(),"庄三");
		Thread t2 = new Thread(new MyRunnable(),"李四");
		//t1.start();
				
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		//默认是主线程
		System.out.println(tg1.getName());
		System.out.println(tg2.getName());
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 1000;i++)
		{
			System.out.println(Thread.currentThread().getName() + "...." + i);
		}
		
	}
	
}
