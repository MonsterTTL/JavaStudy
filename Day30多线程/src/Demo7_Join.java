
public class Demo7_Join {
	
	//Join����
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
						}    //�����ڲ�����ʹ�������ڷ����еľֲ�����ʱҪ��final
					}
					System.out.println(getName() + "...bb");
			}
		};
		
		t2.start();
		t1.start();
		
		
		
		
	}

}
