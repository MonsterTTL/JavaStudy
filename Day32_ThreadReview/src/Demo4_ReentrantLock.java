import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo4_ReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        //jdk1.5互斥锁
        final ReentrantLock r = new ReentrantLock();
        Condition c1 = r.newCondition();
        Condition c2 = r.newCondition();
        Object o1 = new Object();
        Thread a = new Thread(){
            public void run()
            {
                while(true)
                {
                    r.lock();
                    if(temp.ral != 1)
                    {
                        temp.ral = 1;
                        c2.signal();
                        try {
                            c1.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                    }
                    System.out.print("走");
                    System.out.print("司");
                    System.out.println("机");
                    r.unlock();
                }

            }

        };

        Thread b = new Thread(){
            public void run()
            {
                while (true)
                {
                    r.lock();
                    if(temp.ral != 2)
                    {
                        temp.ral = 2;
                        c1.signal();
                        try {
                            c2.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    System.out.print("牛");
                    System.out.println("逼");
                    r.unlock();
                }
            }
        };
        a.start();b.start();
    }
}

class temp{
    public static int  ral = 1;
}

