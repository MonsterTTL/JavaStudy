package com.exercise.Day21;

public class InnerClass {
	public static void main(String[] args)
	{
		var out = new Outer().new Inner();//�����ڲ������
		out.method();
		
		new Outer().Method();
		
		//StaOuter.inner a = new StaOuter.inner();
		//a.print();
		new StaOuter.inner().print();;
	}

}
//�ڲ�������ص㣺
//1.�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��
//2.�ⲿ��Ҫ�����ڲ���Ķ��󣬱��봴������
//�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������

class Outer{
	private int num = 10;
	class Inner{//������Ա��
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