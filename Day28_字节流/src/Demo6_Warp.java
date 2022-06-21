
public class Demo6_Warp {
	public static void main(String[] args) {
		HeiMaStudent heima = new HeiMaStudent(new Student());
		heima.code();
	}
}

interface Coder{
	public void code();
}

class Student implements Coder{

	@Override
	public void code() {
		System.out.println("JavaSE");
		System.out.println("JavaWeb");
	}
	
}
//װ�����ģʽ   //�ô������������
class HeiMaStudent implements Coder{
	private Student s;  //1.��ȡ��װ���������
	public HeiMaStudent(Student s)  //2.�ڹ��췽���д��뱻װ����Ķ���
	{
		this.s = s;
	}
	
	public void code()//��ԭ�й��ܽ�������
	{
		s.code();
		System.out.println("ssh");
		System.out.println("���ݿ�");
		System.out.println("������");
		System.out.println("....");
	}
}
