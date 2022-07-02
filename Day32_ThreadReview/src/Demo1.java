public class Demo1 {
    public static void main(String[] args) {
       // Runtime r = Runtime.getRuntime();
       // Thread a = Thread.currentThread();
        Thread b = new use();
        Thread c = new Thread(new use2());
        c.start();
        b.start();

    }
}

class use extends Thread{

    public void run()
    { synchronized (use2.class){
            for(int i = 0;i < 1000;i++)
            {
                System.out.println(i);
            }
        }
    }
}

class use2 implements Runnable{
    public void run(){
        synchronized (use2.class) {
            for (int i = 0; i < 1000; i++) {
                System.out.println((char) ('a' + i));
            }
        }
    }
}

