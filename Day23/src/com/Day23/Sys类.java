package com.Day23;
//��һ��Դ�ļ��У�������������public���ε��ࣨ������Դ��
public class Sys�� {
	public static void main(String[] args) {
		new Demo();
		System.gc();
		long start  = System.currentTimeMillis();
		for(int i = 0;i < 1000;i++)
		{
			System.out.println("*");
		}
		System.out.println(System.currentTimeMillis() - start);//��ȡ��ǰʱ��ĺ���ֵ
		
		String[] arr = {"hello","The","World"};
		String[] arr2 = new String[5];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		for(int i = 0;i < arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		System.exit(0);//����������ֹ���˳�Java�����
						//�����쳣��ֹ
	}

}

class Demo{
	public void finalize()
	{
		System.out.println("���������");
	}
}
