package com.Day31;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo8_�̳߳� {
	public static void main(String[] args) {
//		Executor e1 = 
		ExecutorService pool = Executors.newFixedThreadPool(2); //�����̳߳�
		pool.submit(new MyRunnable());   //���̷߳Ž�������,��ִ��
		pool.submit(new MyRunnable());
		pool.shutdown();   //�ر��̳߳�
	}

}
