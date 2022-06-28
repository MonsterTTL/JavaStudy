
public class Demo11_Tickets {
	public static void main(String[] args) {
		new Ticker().start();
		new Ticker().start();
		new Ticker().start();
		new Ticker().start();
	}

}

class Ticker extends Thread{
	private static int tickets = 100;
	public void run() {
		while(true) {
			synchronized(Ticker.class) {
							if(tickets <= 0)
			{
				break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() + "...ÕâÊÇµÚ" + tickets-- +"ºÅÆ±");
			}

		}
	}
}
