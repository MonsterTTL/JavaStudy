
public class Demo7_Join {
	
	//Join方法
	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 1000;i++)
					System.out.println(getName() + "...aaaa");
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 10;i++)
					if(i == 2)
					{
						try {
							t1.join(1);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}    //匿名内部类在使用他所在方法中的局部变量时要用final
					}
					System.out.println(getName() + "...bb");
			}
		};
		
		t2.start();
		t1.start();
		
		
		
		
	}

}
