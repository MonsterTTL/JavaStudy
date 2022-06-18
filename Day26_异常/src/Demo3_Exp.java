
public class Demo3_Exp {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}catch (Exception e) {   //Exception e = new ArithmeticException("\by zero");
			System.out.println(e.getMessage());
			System.out.println(e);   // 调用toString方法打印类名和异常信息
			e.printStackTrace();  //jvm默认处理
		}
		System.out.println("111");
		
	}

}
