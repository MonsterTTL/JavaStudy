import java.util.concurrent.*;

public class Demo7_CallAble {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService e = Executors.newFixedThreadPool(2);
        Future<?> future = e.submit(new MyCallable(20));
        Future<?> future1 = e.submit(new MyCallable(100));

        System.out.println(future.get());
        System.out.println(future1.get());

        e.shutdown();
    }
}

class MyCallable implements Callable<Integer>{
    private int num;
    public MyCallable(int num)
    {
        this.num = num  ;
    }
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= num;i++)
        {
            sum += i;
        }
        return sum;
    }
}
