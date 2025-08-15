package java8features.lambda;

public class SumImpl {
    public static void main(String[] args) {
//        SumInterface sumInterface = (a,b)->{
//            return a+b;
//        };
//        System.out.println(sumInterface.sum(10,20));
//
//
//        SumInterface sumMult = (c,d)->{
//            return c*d;
//        };
//        System.out.println(sumInterface.sum(2,3));
//
//
//
//
//        // thread imple
//        Runnable runnable = ()->{
//            //this would be our thread body
//            for (int i=0;i<10;i++){
//                System.out.println(i);
//
//            }
//
//
//        };
//        runnable.run();
//        Thread thread  = new Thread(runnable);
//        thread.start();




        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable: " + i + " | Thread: " + Thread.currentThread().getName());
            }
        };

        System.out.println("Calling runnable.run():");
        runnable.run(); // runs in main thread

        System.out.println("\nCalling thread.start():");
        Thread thread = new Thread(runnable);
        thread.start(); // runs in a new thread
    }







    }








