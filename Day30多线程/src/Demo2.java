
public class Demo2 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();//�����������
		Thread t = new Thread(new Runa());
		//mt.run();
		t.start();
		mt.start();//����һ���߳�
		for(int i = 0; i <1000;i++)
		{
			System.out.println("bb");
		}
		
	}
}
//���ַ�ʽʵ�ֶ��߳�
class MyThread extends Thread {  //�̳�Thread
	public void run()			//��дrun����
	{							//��Ҫִ�еĴ������run��
		for(int i = 0;i < 1000;i++)
		{
			System.out.println("aaaaaaaaaaaaaaaaaaaa");
		}
	}
}

class Runa implements Runnable{

	@Override
	public void run() {
					//��дrun����
									//��Ҫִ�еĴ������run��
			for(int i = 0;i < 1000;i++)
			{
				System.out.println("cccccccccc");
			}
		
		
	}
	
}
