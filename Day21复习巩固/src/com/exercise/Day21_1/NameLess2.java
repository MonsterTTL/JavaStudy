package com.exercise.Day21_1;

public class NameLess2 {
	public static void main(String[] args) {
		//Outer2.method().show();
		pr t = Outer2.method();
		t.show();
	}

}

interface pr{
	public void show();
}

class Outer2{
	public static pr method()
	{
		return new pr()//�൱�ڷ���һ��ʵ����pr�ӿڵ���ʵ��
			{
				public void show()
				{
					System.out.println("I'm Your Father");
				}
			};
	}
	
}
