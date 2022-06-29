package com.Day31;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo8_线程池 {
	public static void main(String[] args) {
//		Executor e1 = 
		ExecutorService pool = Executors.newFixedThreadPool(2); //创建线程池
		pool.submit(new MyRunnable());   //将线程放进池子里,并执行
		pool.submit(new MyRunnable());
		pool.shutdown();   //关闭线程池
	}

}
