package com.Day31;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//互斥锁
public class Demo6_ReentrantLock {
	
		public static void main(String[] args) {
			Printer3 p1 = new Printer3();
			
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

	class Printer3{
		private int flag = 1;
		private ReentrantLock r = new ReentrantLock();
		private Condition c1 = r.newCondition();
		private Condition c2 = r.newCondition();
		private Condition c3 = r.newCondition();
		public void  print1() throws InterruptedException {
			r.lock();
			if(flag != 1) {
				c1.await();	//执行一次后等待
			}//用哪个对象锁的，就用哪个对象notify 和 wait
			System.out.print("嘿");
			System.out.print("吗");
			System.out.print("程");
			System.out.println("序");
			flag = 2;
			//this.notifyAll();//随机唤醒单个等待的线程
			c2.signal();
			r.unlock();
		}
		
		public void print2() throws InterruptedException {
			r.lock();
			if(flag != 2)
			{
				c2.await();;   //线程2在此等待
			}
			System.out.print("穿");
			System.out.print("值");
			System.out.print("博");
			System.out.println("客");
			flag = 3;
			//this.notifyAll();
			c3.signal();
			r.unlock();
		}
		
		public void print3() throws InterruptedException {
			r.lock();
			if(flag != 3)
			{
				c3.await();
			}
			System.out.print("i");
			System.out.print("t");
			System.out.print("h");
			System.out.println("e");
			flag = 1;
			//this.notifyAll();
			c1.signal();
			r.unlock();
		}
	}
	
	


