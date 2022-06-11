package com.exercise.Day21_1;
public class NameLess {
	public static void main(String[] args) {
		new Outer().new Inner().print();
		new Outer().method();
		//Show(new Outer().method());
		Show(new Inter() {
			public void print()
			{
				System.out.println("Who's Your Daddy?");
			}
		});//匿名的内部类
	}
	public static void Show(Inter a)
	{
		a.print();
	}

}


//匿名内部类  --- 当作参数传递(可以看作一个对象)
//是内部类的简写
//匿名内部类只针对重写一个方法时使用
//多个方法的重写不方便
interface Inter{
	public void print();
}

class Outer{
	class Inner implements Inter{
		public void print()
			{
				System.out.println("Hello World");
			}
	    }
		
	public void method()
	{
		
		Inter i = new Inter() {
			public void print()//实现Inter接口
			{
				System.out.println("H i World!");
			}
			
		};
		i.print();
		i.print();
		
	}
}
