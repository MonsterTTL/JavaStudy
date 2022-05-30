import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

import javax.swing.Timer;

public class TalkingClock {
	private int interrupt;//´¥·¢¼ä¸ô
	private boolean beep;
	
	
	public TalkingClock(int interrupt,boolean beep)
	{
		this.interrupt = interrupt;
		this.beep = beep;
	}
	
	public void start()
	{
		TimePrinter listener = new TimePrinter();
		Timer timer = new Timer(interrupt,listener);
		timer.start();
	} 
	
	public class TimePrinter implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("At the tone,the time is "+Instant.ofEpochMilli(event.getWhen()));
			if(beep)Toolkit.getDefaultToolkit().beep();
			
		}
	}

}
