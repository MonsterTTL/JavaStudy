package com.review.student;

public class Constructer {
	public static void main(String args[])
	{
		var p1 = new Person("�ܸ�",20);
		var p2 = new Person("��˾��",24);
		new Person();
		p1.Show();
	}
}

class Person{
	private String name ;
	private int age;
	Person(String name ,int age)
	{
		this.name = name;
		this.age = age;
		System.out.println(name+" "+age+"�꣬��ѧ��");
	}
	Person()
	{
		System.out.println("���ǿղι���");
	}
	
	public void Show()
	{
		System.out.println(name+" "+age+"�꣬��ѧ��");
	}
}
