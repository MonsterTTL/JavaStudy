package com.review.student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Constructer {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		
		var p1 = new Person("周哥",20);
		var p2 = new Person("走司机",24);
		new Person();
		p1.Show(1);
		Class help = p1.getClass();
		Method[] methods = help.getDeclaredMethods();
		Field[] fields = help.getDeclaredFields();
		for(Method e:methods)
		{
			System.out.print(Modifier.toString(e.getModifiers())+" ");
			System.out.print(e.getName()+" ");
			Class p[]= e.getParameterTypes();
			System.out.print("(");
			for(Class m:p)
			{
				System.out.print(m.getSimpleName()+"");
			}
			System.out.println(")");
		}
		System.out.println("Here is Fields:");
		for(Field e:fields)
		{
			System.out.print(Modifier.toString(e.getModifiers())+" "+e.getType().getSimpleName()+
					" "+e.getName()+";");
			System.out.println();
			
		}
		Method use = help.getDeclaredMethod("Show",int.class);
		use.invoke(p1, 0);
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
	
	public void Show(int a)
	{
		System.out.println(name+" "+age+"岁，是学生");
	}
}
