package JavaBsicsAZLearn.Threads;

public class ThreadExample1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread number "+Thread.currentThread().getId()+" is running...");
    }
}
