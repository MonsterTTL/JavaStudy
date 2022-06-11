package com.review.student;

public class inheribt {
	public static void main(String[] args) {
		Teacher1 one = new Teacher1(1000,"666","baba");
		//System.out.println(one);
		System.out.println(one);
		
	}
}

class Teacher{
	private int salary;
	private String num;
	Teacher(int salary,String num)
	{
		System.out.println("父类构造");
		this.salary = salary;
		this.num = num;
	}
	Teacher()
	{
		System.out.println("父类构造 空参");
	};
	public String toString()
	{
		System.out.println("父类转");
		return salary+" "+num;
	}
	public String getNum()
	{
		return num;
	}
	public int getSalaly()
	{
		return salary;
	}
	
}

class Teacher1 extends Teacher{
	
	private String name ;
	public Teacher1(int salary,String num,String name)
	{
		super(salary,num);
		this.name = name;
	}
	public Teacher1(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String ret = super.toString()+" ";
		ret += name;
		return ret;
	}
	
}