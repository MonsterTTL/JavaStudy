//A.��̬(polymorphic)
// ������ڵĶ�����̬

//B.��̬ǰ��
//1.Ҫ�м̳й�ϵ
//2.�з�����д
//3.Ҫ�и�������ָ���������
public class duoTai {
	public static void main(String[] args)
	{
		AnimalZ one = new Catz();//��������ָ���������
		//����ʱָ����Ǹ���ķ�������������ʱ���е�������ķ�������̬�󶨣�
		Catz two = (Catz)one;
		one.eat();
		System.out.println(one.num);// ָֻ������Cat�е�super��
		System.out.println(two.num);// ָ��������Cat�е�����
		
	}

}

class AnimalZ{
	int num = 10;
	public void eat()
	{
		System.out.println("����Է�");
	}
}

class Catz extends AnimalZ{
	int num = 20;
	public void eat()
	{
		System.out.println("è����");
	}
}