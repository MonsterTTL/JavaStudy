
public class Demo5_Sleep {
	public static void main(String[] args) throws InterruptedException {
		//demo1();
		new Thread() {
			public void run() {
				for(int i = 0;i < 10;i++) {
					System.out.println(getName()+ "aaaaaa");
					try {
						Thread.sleep(100);//�Զ��Ӵ�˯��,��ʱ������
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i = 0;i < 10;i++) {
					System.out.println(getName()+ "bb");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	
	}

	private static void demo1() throws InterruptedException {
		for(int i = 20;i >= 0;i--)
		{
			System.out.println("����ʱ��" + i + "��");
			Thread.sleep(1000);
		}
	}

}
