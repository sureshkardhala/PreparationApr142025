package MultiThreading;
import java.lang.Runnable;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Inside Thread 3 : " + Thread.currentThread() + " " + i);
        }
    }
}
