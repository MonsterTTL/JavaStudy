import javax.swing.JOptionPane;
import javax.swing.Timer;



public class InnerClassTest {
	public static void main(String[] args)
	{
		TalkingClock clock = new TalkingClock(1000,true);
		//clock.start();
		TalkingClock.TimePrinter listener = clock.new TimePrinter();//�˴�listnerΪTimePrinter���ڲ��࣬
		//����ʵ����ActionListener�ӿ�  
		Timer timer = new Timer(1000,listener);timer.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
