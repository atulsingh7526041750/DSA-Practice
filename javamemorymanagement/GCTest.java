package javamemorymanagement;

public class GCTest {

    static class User {
        int id;

        User(int id) {
            this.id = id;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object destroyed: " + id);
        }
    }

    public static void main(String[] args) {

        createObjects();

        System.out.println("Back in main");

        System.gc();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

    static void createObjects() {

        User u1 = new User(1);
        User u2 = new User(2);

        System.out.println("Objects created");
    }
}
