package com.exercise.Day21;

public class InnerClass2 {
	public static void main(String[] args) {
		new Outer2().new Inner().show();
		new OuterBlock().method();
	}

}

class Outer2{
	public int num = 10;
	class Inner{
		public int num = 20;
		public void show()
		{
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer2.this.num);//外部类的引用
		}
	}
}
//局部内部类 --- 局部变量
//从内部类访问本地变量必须为最终变量
class OuterBlock{
	public void method()
	{
		class Inner{
			public void print()
			{
				System.out.println("Hello World!");
			}
		}
		new Inner().print();
	}
	
}

