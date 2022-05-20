import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calender {
	public static void main(String [] arg)
	{
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();//查看本月是几月（主要为了看本月有多少天）
		int today = date.getDayOfMonth();//查看今天是本月几号
		date = date.minusDays(today - 1);//把时间设置为本月第一天
		
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		
		System.out.println("MON TUE WED THU FRI SAT SUN");
		for(int i = 1;i < value;i++)//打印缩进,使本月一号与星期对应起来
		{
			System.out.print("    ");
		}
		
		while(date.getMonthValue() == month)//当时间还在本月时，继续打印
		{
			System.out.printf("%3d",date.getDayOfMonth());//打印今天几号
			if(date.getDayOfMonth() == today)//如果恰好为今天，就打印一个星号
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
			date = date.plusDays(1);//把时间更新一波
			if(date.getDayOfWeek().getValue() == 1) System.out.println();//如果是周一了就另起一行
		}
	}

}
