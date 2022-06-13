package com.Day23;
//在一个源文件中，不允许用两个public修饰的类（会抢资源）
public class Sys类 {
	public static void main(String[] args) {
		new Demo();
		System.gc();
		long start  = System.currentTimeMillis();
		for(int i = 0;i < 1000;i++)
		{
			System.out.println("*");
		}
		System.out.println(System.currentTimeMillis() - start);//获取当前时间的毫秒值
		
		String[] arr = {"hello","The","World"};
		String[] arr2 = new String[5];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		for(int i = 0;i < arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		System.exit(0);//给零正常终止，退出Java虚拟机
						//非零异常终止
	}

}

class Demo{
	public void finalize()
	{
		System.out.println("清道夫来了");
	}
}
