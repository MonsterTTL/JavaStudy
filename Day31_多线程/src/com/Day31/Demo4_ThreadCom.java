package com.Day31;
//等待唤醒机制
public class Demo4_ThreadCom {
	public static void main(String[] args) {
		Printer p =new Printer();
		new Thread() {
			public void run() {
				while(true)
					try {
						p.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true)
					try {
						p.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}.start();
	}
}


class Printer{
	private int flag = 1;
	public synchronized void  print1() throws InterruptedException {
		if(flag != 1) {
			this.wait();	//执行一次后等待
		}
		System.out.print("嘿");
		System.out.print("吗");
		System.out.print("程");
		System.out.println("序");
		flag = 2;
		this.notify();//随机唤醒单个等待的线程
	}
	
	public synchronized void print2() throws InterruptedException {
		if(flag != 2)
		{
			this.wait();
		}
		System.out.print("穿");
		System.out.print("值");
		System.out.print("博");
		System.out.println("客");
		flag = 1;
		this.notify();
	}
}