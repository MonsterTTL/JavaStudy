package com.review.student;

public class CodeBlock {
	public static void main(String[] args) {
		int x = 10;
		{
			x += 10;
			System.out.println(x);
		}
		x -= 5;
		System.out.println(x);
		var p1 = new student("zhouge",24);
		new student();
		new student();
		new student();

	}
	static {
		System.out.println("我先执行");
	}

}

class student{
	private String name;
	private int age;
	private static int times = 0;
	public student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public student()
	{
		System.out.println("空参构造");
	}
	
	{						//构造代码块，每次创先对象优先执行
	
		System.out.println("构造代码块"+" "+times);//打印的仍是空参状态下
		times++;
	}
	static {
		System.out.println("初始化完成");  //随着类的加载而加载，只执行一次，用于给类初始化
											//一般用来加载驱动
											//若放在主方法外，优先于主方法运行
	}
}