import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
//异常的分支
//try catch 的嵌套
public class Demo6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//将一个整数转为二进制字符串
		System.out.println("请输入一个整数，转化为二进制");
		System.out.println("输入quit以退出");
		String stk = in.nextLine();
		int temp;
		
		while(!"quit".equals(stk))
		{	
			try {
				temp = Integer.parseInt(stk);
				System.out.println(Integer.toBinaryString(temp));
			}catch(Exception e)
			{
				try {
				new BigInteger(stk);
				System.out.println("录入的整数信息有误,数据过大");
				}catch(Exception e1)
				{
					try {
					new BigDecimal(stk);
					System.out.println("录入的整数信息有误,不能录入小数");
					}catch(Exception e3)
					{
						System.out.println("录入的整数信息有误,不能输入字符串");
					}
				}
			}
			stk = in.nextLine();
		}
		System.out.println("Exit");
	}

}
