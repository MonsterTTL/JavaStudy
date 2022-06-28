
public class Demo8_礼让线程 {
	
	//yield 让出控制权
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
				Thread.yield();//让出cpu
			}
			System.out.println(getName() + "..." + i);
		}
	}
}
