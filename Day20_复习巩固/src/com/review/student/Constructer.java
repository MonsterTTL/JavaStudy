package com.review.student;

public class Constructer {
	public static void main(String args[])
	{
		var p1 = new Person("周哥",20);
		var p2 = new Person("走司机",24);
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
		System.out.println(name+" "+age+"岁，是学生");
	}
	Person()
	{
		System.out.println("这是空参构造");
	}
	
	public void Show()
	{
		System.out.println(name+" "+age+"岁，是学生");
	}
}
