package com.Day31;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//������
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
	//wait �ͷ���
	//sleep ���ͷ���

	class Printer3{
		private int flag = 1;
		private ReentrantLock r = new ReentrantLock();
		private Condition c1 = r.newCondition();
		private Condition c2 = r.newCondition();
		private Condition c3 = r.newCondition();
		public void  print1() throws InterruptedException {
			r.lock();
			if(flag != 1) {
				c1.await();	//ִ��һ�κ�ȴ�
			}//���ĸ��������ģ������ĸ�����notify �� wait
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("��");
			flag = 2;
			//this.notifyAll();//������ѵ����ȴ����߳�
			c2.signal();
			r.unlock();
		}
		
		public void print2() throws InterruptedException {
			r.lock();
			if(flag != 2)
			{
				c2.await();;   //�߳�2�ڴ˵ȴ�
			}
			System.out.print("��");
			System.out.print("ֵ");
			System.out.print("��");
			System.out.println("��");
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
	
	


