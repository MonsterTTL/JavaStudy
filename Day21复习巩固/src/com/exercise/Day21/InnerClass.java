package com.exercise.Day21;

public class InnerClass {
	public static void main(String[] args)
	{
		var out = new Outer().new Inner();//创建内部类对象
		out.method();
		
		new Outer().Method();
		
		//StaOuter.inner a = new StaOuter.inner();
		//a.print();
		new StaOuter.inner().print();;
	}

}
//内部类访问特点：
//1.内部类可以直接访问外部类的成员，包括私有
//2.外部类要访问内部类的对象，必须创建对象
//外部类名.内部类名 对象名 = 外部类对象.内部类对象；

class Outer{
	private int num = 10;
	class Inner{//看作成员类
		public void method()
		{
			System.out.println("Hello World!");
			System.out.println(num);
		}
		
		
	}
	
	private class Inner2{
		public void method()
		{
			System.out.println("Hello World2!");
			System.out.println(num);
		}
	}
	
	public void Method()
	{
		new Inner2().method();
		
	}
}

class StaOuter{
	static class inner{
		public void print()
		{
			System.out.println("Who's Your Daddy?");
		}
	}
}