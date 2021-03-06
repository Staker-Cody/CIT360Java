package com.company.Threads;
import java.util.concurrent.*;

public class SoManyThreads  {
    public static void main(final String[] arguments) throws InterruptedException {


        Executor executor = Executors.newCachedThreadPool();
        executor.execute(new Task());
        executor.execute(new Task());
        ThreadPoolExecutor pool = (ThreadPoolExecutor)executor;
        pool.shutdown();
    }
    static class Task implements Runnable {
        public void run() {
            try {
                Long duration = (long) (Math.random() * 5);
                System.out.println("Running Task!");
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Task Completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
