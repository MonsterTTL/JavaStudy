
public class Demo8_�����߳� {
	
	//yield �ó�����Ȩ
	public static void main(String[] args) {
		new MThread().start();
		new MThread().start();
		
	}

}


class MThread extends Thread{
	public void run() {
		for(int i = 1;i <= 1000;i++)
		{
			if(i % 10 == 0)
			{
				Thread.yield();//�ó�cpu
			}
			System.out.println(getName() + "..." + i);
		}
	}
}
