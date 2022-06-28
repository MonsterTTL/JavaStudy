//用匿名对象实现
public class Demo3_nameless {
	public static void main(String[] args) {
		new Thread("走司机") {    //通过构造方法给Name赋值
			public void run() {
				for(int i = 0;i < 10000;i++)
				{
					this.setName("鸡扒");    //通过set方法设置名字
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
