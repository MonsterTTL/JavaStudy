
public class Demo3_Exp {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}catch (Exception e) {   //Exception e = new ArithmeticException("\by zero");
			System.out.println(e.getMessage());
			System.out.println(e);   // ����toString������ӡ�������쳣��Ϣ
			e.printStackTrace();  //jvmĬ�ϴ���
		}
		System.out.println("111");
		
	}

}
