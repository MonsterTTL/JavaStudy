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
		});//�������ڲ���
	}
	public static void Show(Inter a)
	{
		a.print();
	}

}


//�����ڲ���  --- ������������(���Կ���һ������)
//���ڲ���ļ�д
//�����ڲ���ֻ�����дһ������ʱʹ��
//�����������д������
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
			public void print()//ʵ��Inter�ӿ�
			{
				System.out.println("H i World!");
			}
			
		};
		i.print();
		i.print();
		
	}
}
