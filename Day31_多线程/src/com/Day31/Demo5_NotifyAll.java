package com.Day31;

public class Demo5_NotifyAll {
	public static void main(String[] args) {
		Printer2 p1 = new Printer2();
		
		new Thread() {
			public void run() {
				while(true)
				{
					try {
						p1.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true)
				{
					try {
						p1.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true)
				{
					try {
						p1.print3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}
//wait 释放锁
//sleep 不释放锁

class Printer2{
	private int flag = 1;
	public synchronized void  print1() throws InterruptedException {
		while(flag != 1) {
			this.wait();	//执行一次后等待
		}//用哪个对象锁的，就用哪个对象notify 和 wait
		System.out.print("嘿");
		System.out.print("吗");
		System.out.print("程");
		System.out.println("序");
		flag = 2;
		this.notifyAll();//随机唤醒单个等待的线程
	}
	
	public synchronized void print2() throws InterruptedException {
		while(flag != 2)
		{
			this.wait();   //线程2在此等待
		}
		System.out.print("穿");
		System.out.print("值");
		System.out.print("博");
		System.out.println("客");
		flag = 3;
		this.notifyAll();
	}
	
	public synchronized void print3() throws InterruptedException {
		while(flag != 3)
		{
			this.wait();
		}
		System.out.print("i");
		System.out.print("t");
		System.out.print("h");
		System.out.println("e");
		flag = 1;
		this.notifyAll();
	}
}
