
public class Abstract {
	public static void main(String[] args)
	{
		People one = new Man();
		one.talk();
		one = new Woman();
		one.talk();
	}

}
//�������п���û�г��󷽷��������ɳ��󷽷�����һ���ǳ�������߽ӿ�
//�������޷���ʵ���������ǿ�����������
abstract class People{
	String name;
	int age;
	public abstract void talk();
}
//������ĳ�Ա�����ȿ����Ǳ�����Ҳ�����ǳ���������abstract �������γ�Ա����
//��Ա�����ȿ����ǳ���ģ�Ҳ�����Ǿ����
//abstract && static �������  -- û������
//abstract && final �������  -- ������д
//abstract && private ������� -- ���ܼ̳�
class Man extends People{
	public void talk()
	{
		System.out.println("Man Talk");
	}
}

class Woman extends People{
	public void talk()
	{
		System.out.println("Woman Talk");
	}
}
