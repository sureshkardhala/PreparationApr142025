package MultiThreading;
import  java.lang.Thread;

public class Thread2 extends Thread{
    public Thread2(String threadName){
        super(threadName);
    }

    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Inside" + Thread.currentThread()+ " "+ i);
        }
    }

}
