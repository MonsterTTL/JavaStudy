
public class Demo9_线程优先级 {
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 100;i++)
				{
					System.out.println(getName() + "...." + "MIN" );
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 100;i++)
				{
					System.out.println(getName() + "...." + "MAX" );
				}
			}
		};
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
	
	
	}

}
