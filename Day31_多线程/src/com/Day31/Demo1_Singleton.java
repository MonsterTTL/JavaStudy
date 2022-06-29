package com.Day31;
//单例设计模式：保证类在内存中只有一个对象.
public class Demo1_Singleton {
	public static void main(String[] args) {
		//Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		System.out.println( s1 == s2);
	}

}
//饿汉式和懒汉式的区别
//1.饿汉式是空间换时间，懒汉式是时间换空间
//2.在多线程访问时，饿汉式不会创建多个对象，而懒汉式有可能会创建多个对象
//

//饿汉式
class Singleton{
	//1.私有构造方法，其他类不能使用该构造方法了
	private Singleton() {
		
	}
	//2.创建本类对象,私有（防止修改）
	private static Singleton s = new Singleton();
	//3.提供对外的接口
	public static Singleton getSingleton()
	{
		return s;
	}
}

//懒汉式   延迟的加载模式
class Singleton2{
	//1.私有构造方法，其他类不能使用该构造方法了
	private Singleton2() {
		
	}
	//2.仅仅声明,私有（防止修改）
	private static Singleton2 s2 ;
	//3.提供对外的接口
	public static Singleton2 getSingleton()
	{
		if(s2 == null)
		{
			s2 = new Singleton2();
		}
		return s2;
	}
}

class Singleton3{
	//1.私有构造方法，其他类不能使用该构造方法了
	private Singleton3() {
		
	}
	//2,常量修饰
	public  static final Singleton3 s3 = new Singleton3() ;

}


