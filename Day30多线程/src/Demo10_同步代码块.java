
public class Demo10_ͬ������� {
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
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("����");
		}
	
	}
	
	public void print3() {
		synchronized(d) {   //ͬ������
			System.out.print("˭");
			System.out.print("��");
			System.out.print("��");
			System.out.println("����");
		}
	}
	//�Ǿ�̬��ͬ����������������this
	public synchronized void print2() {
			   //ͬ������
			System.out.print("˭");
			System.out.print("��");
			System.out.print("��");
			System.out.println("����");
			
	}
	
	public static void print4() {  //��̬��ͬ���������������� ������ֽ������
		synchronized(Printer.class) {
		System.out.print("˭");
		System.out.print("��");
		System.out.print("��");
		System.out.println("����");
			}
		}
	}
class Suo{

}
