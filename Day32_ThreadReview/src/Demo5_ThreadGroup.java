public class Demo5_ThreadGroup {
    public static void main(String[] args) {
        Myrunable my = new Myrunable();
        //成组管理线程
        ThreadGroup tg1 = new ThreadGroup("线程1");
        Thread t1 = new Thread(tg1,my,"张三");
        Thread t2 = new Thread(my, "李四");



        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());

    }
}

class Myrunable implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i < 1000;i++)
        {
            System.out.println(Thread.currentThread().getName() + "..." + i);
        }
    }
}
