package com.Day31;
//�������ģʽ����֤�����ڴ���ֻ��һ������.
public class Demo1_Singleton {
	public static void main(String[] args) {
		//Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		System.out.println( s1 == s2);
	}

}
//����ʽ������ʽ������
//1.����ʽ�ǿռ任ʱ�䣬����ʽ��ʱ�任�ռ�
//2.�ڶ��̷߳���ʱ������ʽ���ᴴ��������󣬶�����ʽ�п��ܻᴴ���������
//

//����ʽ
class Singleton{
	//1.˽�й��췽���������಻��ʹ�øù��췽����
	private Singleton() {
		
	}
	//2.�����������,˽�У���ֹ�޸ģ�
	private static Singleton s = new Singleton();
	//3.�ṩ����Ľӿ�
	public static Singleton getSingleton()
	{
		return s;
	}
}

//����ʽ   �ӳٵļ���ģʽ
class Singleton2{
	//1.˽�й��췽���������಻��ʹ�øù��췽����
	private Singleton2() {
		
	}
	//2.��������,˽�У���ֹ�޸ģ�
	private static Singleton2 s2 ;
	//3.�ṩ����Ľӿ�
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
	//1.˽�й��췽���������಻��ʹ�øù��췽����
	private Singleton3() {
		
	}
	//2,��������
	public  static final Singleton3 s3 = new Singleton3() ;

}


