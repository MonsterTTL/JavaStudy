import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
//�쳣�ķ�֧
//try catch ��Ƕ��
public class Demo6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//��һ������תΪ�������ַ���
		System.out.println("������һ��������ת��Ϊ������");
		System.out.println("����quit���˳�");
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
				System.out.println("¼���������Ϣ����,���ݹ���");
				}catch(Exception e1)
				{
					try {
					new BigDecimal(stk);
					System.out.println("¼���������Ϣ����,����¼��С��");
					}catch(Exception e3)
					{
						System.out.println("¼���������Ϣ����,���������ַ���");
					}
				}
			}
			stk = in.nextLine();
		}
		System.out.println("Exit");
	}

}
