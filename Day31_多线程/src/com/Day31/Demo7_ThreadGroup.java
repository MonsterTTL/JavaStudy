package com.Day31;

public class Demo7_ThreadGroup {
	public static void main(String[] args) {
//		demo1();
		ThreadGroup tg  = new ThreadGroup("������ְ�");
		MyRunnable mr  = new MyRunnable();
		Thread t1 = new Thread(tg,mr,"�԰�");
		Thread t2 = new Thread(tg,mr,"����");
		
		System.out.println(t1.getThreadGroup().getName()); // ��ȡ����
		System.out.println(t2.getThreadGroup().getName());
		
		tg.setDaemon(true);
	}

	private static void demo1() {
		Thread t1 = new Thread(new MyRunnable(),"ׯ��");
		Thread t2 = new Thread(new MyRunnable(),"����");
		//t1.start();
				
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		//Ĭ�������߳�
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
