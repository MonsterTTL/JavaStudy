import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MainFunction {
	public static void main(String[] args)
	{
		var planets = new String[] {"Mercury","Venus","Earth","Mars"
				,"Jupiter","Urans","Neptune"};
		System.out.println(Arrays.toString(planets));
		System.out.println("Sort in dictionary list:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("Sort by Length:");
		Arrays.sort(planets,(first,second) -> first.length() - second.length());//lambda表达式，传代码块
		System.out.println(Arrays.toString(planets));
		
		Timer timer = new Timer(10000,event -> 
		System.out.println("The time is "+ new Date()));
		timer.start();
		
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
		
	}

}
