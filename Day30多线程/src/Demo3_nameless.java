//����������ʵ��
public class Demo3_nameless {
	public static void main(String[] args) {
		new Thread("��˾��") {    //ͨ�����췽����Name��ֵ
			public void run() {
				for(int i = 0;i < 10000;i++)
				{
					this.setName("����");    //ͨ��set������������
					System.out.println(this.getName() + "aaaa");
				}
			}
		}.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0;i < 10000;i++)
				{
					System.out.println( "bbb");
				}
			}
		}).start();
		
//		class a{
//			public void show() {
//				
//				for(int i = 0; i < 10000;i++)
//					{
//					System.out.println("======================================");
//					}
//			}
//		};
//		new a().show();

		
		
		
		
		
	}

}
