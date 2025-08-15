package interview;

import java.util.Collection;
import java.util.concurrent.*;

public class RunnablePractice{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        Check check = new Check();
//        Thread thread = new Thread(check);
//        thread.start();
//
//        System.out.println("This is the main thead"+Thread.currentThread().getName());
//
//        for (int i=0;i<5 ;i++){
//            Thread.sleep(500);
//            System.out.println(i);
//        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
       Callable<Integer> task = ()->{
           int sum = 0;
           sum = sum+2;
           return sum;

        };

        Future<Integer>future = executor.submit(task);
        Integer result = future.get();


    }
}

class Check implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}




