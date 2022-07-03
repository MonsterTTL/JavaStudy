import javafx.scene.input.DataFormat;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        Timer t1 = new Timer();
        t1.schedule(new MyTask(),new Date(122,6,2,17,55,10),3000);
        while(true)
        {
            Thread.sleep(1000);
            System.out.println(new Date());
        }

    }
}

class MyTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("我嚓后");
    }
}
