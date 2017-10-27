package com.company;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class isPrime {
    public static void main(final String[] arguments) throws InterruptedException {


        Executor executor = Executors.newCachedThreadPool();
        executor.execute(new checkIsPrime(21325));
        executor.execute(new checkIsPrime(21321581));
        executor.execute(new checkIsPrime(54684));
        executor.execute(new checkIsPrime(213215));

        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;
        pool.shutdown();


    }

    static class checkIsPrime implements Runnable {
        private int b;

        checkIsPrime(int x) {
            b = x;
            System.out.println("Checking " + b);

        }

        public void run() {

            try {

                Thread.sleep(b);

                boolean isIt = false;
                if (b % 2 == 0) {
                    isIt = false;
                } else {
                    for (int i = 3; i * i <= b; i += 2) {
                        if (b % i == 0)
                            isIt = false;
                    }
                    isIt = true;
                }

                if (isIt == false) {

                    System.out.println(b + " is not prime");
                } else {


                    System.out.println(b + " is prime");

                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            }







        }
    }


