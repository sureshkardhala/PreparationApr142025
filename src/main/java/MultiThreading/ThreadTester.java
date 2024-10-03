package MultiThreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main Method Starting");

        Thread thread1 = new Thread1("thread1");
        thread1.start();

//        Thread thread2 = new Thread2("thread2");
//        thread2.setDaemon(true);
//        thread2.start();

        Thread thread3 = new Thread(new Thread3(), "Thread3");
        thread3.start();

        System.out.println("Main Method Ending");
    }
}
