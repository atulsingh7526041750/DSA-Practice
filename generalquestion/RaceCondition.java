package generalquestion;

public class RaceCondition {
    static int counter = 0;


    public static void main(String[] args) {
        Runnable task = ()->{
            for (int i=0;i<10;i++){
                counter++;
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2  = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {}

        System.out.println("Final Counter Value: " + counter);
    }


    }
