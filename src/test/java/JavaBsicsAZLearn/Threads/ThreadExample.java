package JavaBsicsAZLearn.Threads;

public class ThreadExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread number "+Thread.currentThread().getId()+" is running...");
    }
}
