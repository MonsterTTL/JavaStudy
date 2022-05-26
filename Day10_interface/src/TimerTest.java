import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {
	public static void main(String[] args)
	{
		TimerPrinter listener = new TimerPrinter();
		
		Timer one = new Timer(1000,listener);//每隔1s就回调listener中的actionPerformed方法（实现接口）
		one.start();
		
		JOptionPane.showMessageDialog(null, "要离开吗？");
		System.exit(0);
	}

}
