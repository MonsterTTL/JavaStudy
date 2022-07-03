public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        //等待唤醒机制
        Object o1 = new Object();
        new Thread(){
            public void run(){
                synchronized (o1)
                {
                    while(true)
                    { while(pr.flag != 1)
                        {

                            o1.notifyAll();
                            try {
                                o1.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    pr.flag = 2;
                    pr.print1();

                    }
                }

            }
        }.start();
//wait 方法传入参数就是再设定时间后等待
        new Thread(){
            public void run() {
                synchronized (o1){
                    while(true){
                    while(pr.flag != 2)
                    {
                        o1.notifyAll();
                        try {
                            o1.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    pr.flag = 3;
                    pr.print2();

                    }
                }

            }
        }.start();

        new Thread(){
            public void run(){
                synchronized(o1){
                    while(true)
                    {   while(pr.flag != 3)
                        {

                            o1.notifyAll();
                            try{
                                o1.wait();
                            }catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        pr.flag = 1;
                        pr.print3();

                    }
                }
            }
        }.start();


    }
}
    class pr {
        public static int flag = 1;
        public static void print1() {
            System.out.println("aaaaaaa");
        }

        public static void print2() {
            System.out.println("bbbbbbb");
        }

        public static void print3()
        {
            System.out.println("ccccccc");
        }
    }

