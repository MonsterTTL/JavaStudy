package com.review.student;

import java.util.Scanner;

public class Student {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Please enter your gender:");
			String temp = in.next();
			Student A = new Student("A",10,temp);
			System.out.println(A);
			
		}
		
		
		String name = null;
		int age = 0;
		gender Gen = gender.Unknow ;
		public Student(String name,int age,String G)
		{
			this.name = name;
			this.age = age;
			if(G.equals("woman"))
			{
				this.Gen = gender.Woman;
			}
			else if(G.equals("man"))
			{
				this.Gen = gender.Man;
			}
			else
			{
				this.Gen = gender.Unknow;
			}
		}
		public Student()
		{
			
		}
		public void Study()
		{
			System.out.println("正在学习");
		}
		
		public void Sleep()
		{
			System.out.println("正在睡觉");
		}
		
		public String toString()
		{
			StringBuilder helper = new StringBuilder();
			helper.append(name).append(" ");
			helper.append(age).append(" ");
			helper.append(Gen).append(" ");
			return helper.toString();
		}

}

enum gender{
	
	Woman("woman"),Man("man"),Unknow("unknow");
	
	private String Gen ;
	private gender(String a)
	{
		this.Gen = a;
	}
	private gender()
	{
		
	}
	public String toString()
	{
		return this.Gen;
	}
	
	
	
}