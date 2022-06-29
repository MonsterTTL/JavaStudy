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
//wait �ͷ���
//sleep ���ͷ���

class Printer2{
	private int flag = 1;
	public synchronized void  print1() throws InterruptedException {
		while(flag != 1) {
			this.wait();	//ִ��һ�κ�ȴ�
		}//���ĸ��������ģ������ĸ�����notify �� wait
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.println("��");
		flag = 2;
		this.notifyAll();//������ѵ����ȴ����߳�
	}
	
	public synchronized void print2() throws InterruptedException {
		while(flag != 2)
		{
			this.wait();   //�߳�2�ڴ˵ȴ�
		}
		System.out.print("��");
		System.out.print("ֵ");
		System.out.print("��");
		System.out.println("��");
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
