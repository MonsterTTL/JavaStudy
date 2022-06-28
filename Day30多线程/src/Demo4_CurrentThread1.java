
public class Demo4_CurrentThread1 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println(getName() + "aaaaaa");
			}
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "...bbb");//获取当前线程并获取名字
			}
		}).start();
		System.out.println(Thread.currentThread().getName());
		
	}

}
