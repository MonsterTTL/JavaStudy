
public class InterFace {
	public static void main(String[] args) {
		new demo().print();
		System.out.println(Inter3.num);
	}

}

//InterFace 
//��Ա������ֻ���ǳ����������Ǿ�̬�ҹ�����
//�����ֶ���������
//��Ա������ֻ���ǳ��󷽷�
//Ҳ�����Ǿ�̬˽�еģ�����ֻ���ڲ�ʹ��
//�ӿڿ��Զ�̳�
interface Inter{
	int num = 10;
	private static int Change()
	{
		return 10;
	}
	public static int Change2()
	{
		return 20;
	}
}

interface Inter2{
	int num = 20;
}

interface Inter3 extends Inter{
	
}

class demo implements Inter,Inter2{
	public void print()
	{
		System.out.println(Inter2.num);
	}
}
