// try:����쳣
// catch:�����쳣
// finally:�ͷ���Դ
public class Demo1_EXP {
	public static void main(String[] args) {
		try {
			int c = Tool.div(10, 0);
			System.out.println(c);
		}catch(ArithmeticException e)
		{
			System.out.println("�����ˣ���������Ϊ��");
		}
		finally {
			
		}
		
	}

}

class Tool{
	public static int div(int a,int b)
	{
		return a/b;
	}
}
