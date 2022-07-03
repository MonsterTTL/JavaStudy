import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo6_ThreadPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new Myrunable());  //将线程放进池子里并执行
        pool.submit(new Myrunable());

        pool.shutdown();//关闭线程池
    }
}

