package com.review.student;

public class CodeBlock {
	public static void main(String[] args) {
		int x = 10;
		{
			x += 10;
			System.out.println(x);
		}
		x -= 5;
		System.out.println(x);
		var p1 = new student("zhouge",24);
		new student();
		new student();
		new student();

	}
	static {
		System.out.println("����ִ��");
	}

}

class student{
	private String name;
	private int age;
	private static int times = 0;
	public student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public student()
	{
		System.out.println("�ղι���");
	}
	
	{						//�������飬ÿ�δ��ȶ�������ִ��
	
		System.out.println("��������"+" "+times);//��ӡ�����ǿղ�״̬��
		times++;
	}
	static {
		System.out.println("��ʼ�����");  //������ļ��ض����أ�ִֻ��һ�Σ����ڸ����ʼ��
											//һ��������������
											//�������������⣬����������������
	}
}