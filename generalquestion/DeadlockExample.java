package generalquestion;

public class DeadlockExample {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{

            synchronized (lock1){
                System.out.println("Thread 1 : holds lock 1");
                try {
                    Thread.sleep(2000);
                    System.out.println("Thread 1: Waiting for lock2...");
                }
                catch (InterruptedException interruptedException){
                    System.out.println();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock2!");
                }

            }


        });

        Thread t2 = new Thread(()->{
            synchronized (lock2){
                System.out.println("Thread 2: holds lock2");
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException interruptedException){
                }
                synchronized (lock1) {
                    System.out.println("Thread 2: Acquired lock1!");
                }
            }
        });
        t1.start();
        t2.start();
    }

}
