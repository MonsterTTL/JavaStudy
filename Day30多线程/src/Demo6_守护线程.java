
public class Demo6_�ػ��߳� {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0;i < 2;i++)
				{
					System.out.println(getName() + " ... aaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0;i < 50;i++)
				{
					System.out.println(getName() + " ... bb");
				}
			}
		};
		t2.setDaemon(true);//�����ػ��߳� --- true 
		t1.start();			//���������ػ��̹߳��ˣ��ػ��߳�Ҳ��֮����������һ����ʱ���
		t2.start();
		
	}
	
	

}
