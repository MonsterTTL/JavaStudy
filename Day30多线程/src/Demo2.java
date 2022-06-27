
public class Demo2 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();//创建子类对象
		Thread t = new Thread(new Runa());
		//mt.run();
		t.start();
		mt.start();//启动一个线程
		for(int i = 0; i <1000;i++)
		{
			System.out.println("bb");
		}
		
	}
}
//两种方式实现多线程
class MyThread extends Thread {  //继承Thread
	public void run()			//重写run方法
	{							//将要执行的代码放入run中
		for(int i = 0;i < 1000;i++)
		{
			System.out.println("aaaaaaaaaaaaaaaaaaaa");
		}
	}
}

class Runa implements Runnable{

	@Override
	public void run() {
					//重写run方法
									//将要执行的代码放入run中
			for(int i = 0;i < 1000;i++)
			{
				System.out.println("cccccccccc");
			}
		
		
	}
	
}
