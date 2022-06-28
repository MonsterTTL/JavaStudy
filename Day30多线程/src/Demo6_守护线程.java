
public class Demo6_守护线程 {
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
		t2.setDaemon(true);//设置守护线程 --- true 
		t1.start();			//当其他非守护线程挂了，守护线程也随之结束，，有一定的时间差
		t2.start();
		
	}
	
	

}
