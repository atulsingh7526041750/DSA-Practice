public class ThreadPractice {
    public static void main(String[] args) {

        System.out.println("this is the main thread"+Thread.currentThread().getName());
        PracticeThread practiceThread = new PracticeThread();

        // this is where thread is created.

        // we can see there is a contructor in Thread which takes the runnable object

        Thread thread  = new Thread(practiceThread);
        thread.start();

        System.out.println("This is the main thread ending "+Thread.currentThread().getName());



    }


}


class PracticeThread  implements Runnable{
    @Override
    public void run() {
        System.out.println("this is runnable interface method" +Thread.currentThread().getName());
    }

}
