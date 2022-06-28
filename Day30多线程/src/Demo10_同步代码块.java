
public class Demo10_同步代码块 {
	public static void main(String[] args) {
	     Printer p1 = new Printer();
	     new Thread() {
	    	 public void run() {
	    		 while(true)
	    		 {
	    			 p1.print1();
	    		 }
	    	 }
	     }.start();
	     
	     new Thread() {
	    	 public void run() {
	    		 while(true)
	    		 {
	    			 p1.print2();
	    		 }
	    	 }
	     }.start();
		
	}
	
	

}

class Printer{
	Suo d = new Suo();
	public void print1() {
		synchronized(this) {
			System.out.print("我");
			System.out.print("是");
			System.out.print("你");
			System.out.println("爹！");
		}
	
	}
	
	public void print3() {
		synchronized(d) {   //同步加锁
			System.out.print("谁");
			System.out.print("是");
			System.out.print("你");
			System.out.println("爹？");
		}
	}
	//非静态的同步方法的锁对象是this
	public synchronized void print2() {
			   //同步加锁
			System.out.print("谁");
			System.out.print("是");
			System.out.print("你");
			System.out.println("爹？");
			
	}
	
	public static void print4() {  //静态的同步方法的锁对象是 该类的字节码对象
		synchronized(Printer.class) {
		System.out.print("谁");
		System.out.print("是");
		System.out.print("你");
		System.out.println("爹？");
			}
		}
	}
class Suo{

}
