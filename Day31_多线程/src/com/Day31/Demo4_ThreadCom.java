package com.Day31;
//�ȴ����ѻ���
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
			this.wait();	//ִ��һ�κ�ȴ�
		}
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.println("��");
		flag = 2;
		this.notify();//������ѵ����ȴ����߳�
	}
	
	public synchronized void print2() throws InterruptedException {
		if(flag != 2)
		{
			this.wait();
		}
		System.out.print("��");
		System.out.print("ֵ");
		System.out.print("��");
		System.out.println("��");
		flag = 1;
		this.notify();
	}
}