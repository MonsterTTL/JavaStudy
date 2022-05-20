import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calender {
	public static void main(String [] arg)
	{
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();//�鿴�����Ǽ��£���ҪΪ�˿������ж����죩
		int today = date.getDayOfMonth();//�鿴�����Ǳ��¼���
		date = date.minusDays(today - 1);//��ʱ������Ϊ���µ�һ��
		
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		
		System.out.println("MON TUE WED THU FRI SAT SUN");
		for(int i = 1;i < value;i++)//��ӡ����,ʹ����һ�������ڶ�Ӧ����
		{
			System.out.print("    ");
		}
		
		while(date.getMonthValue() == month)//��ʱ�仹�ڱ���ʱ��������ӡ
		{
			System.out.printf("%3d",date.getDayOfMonth());//��ӡ���켸��
			if(date.getDayOfMonth() == today)//���ǡ��Ϊ���죬�ʹ�ӡһ���Ǻ�
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
			date = date.plusDays(1);//��ʱ�����һ��
			if(date.getDayOfWeek().getValue() == 1) System.out.println();//�������һ�˾�����һ��
		}
	}

}
