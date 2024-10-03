package MultiThreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main Method Starting");

        Thread thread1 = new Thread1();
        thread1.start();


        System.out.println("Main Method Ending");
    }
}
