import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {
	public static void main(String[] args)
	{
		TimerPrinter listener = new TimerPrinter();
		
		Timer one = new Timer(1000,listener);//ÿ��1s�ͻص�listener�е�actionPerformed������ʵ�ֽӿڣ�
		one.start();
		
		JOptionPane.showMessageDialog(null, "Ҫ�뿪��");
		System.exit(0);
	}

}
