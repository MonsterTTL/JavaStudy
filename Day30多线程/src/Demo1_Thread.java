
public class Demo1_Thread {
	public static void main(String[] args) {
		for(int i = 0;i < 1000000;i++)
		{
			new Demo();
		}
		
		for(int i = 0;i < 10000;i++)
		{
			System.out.println("�������߳�");
		}
	}

}

class Demo{
	@Override
	public void finalize()  {
		System.out.println("��������ɨ��");
	}
}
