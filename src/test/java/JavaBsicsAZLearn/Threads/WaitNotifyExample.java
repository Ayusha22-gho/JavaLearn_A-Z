package JavaBsicsAZLearn.Threads;

class Processor{

    public synchronized void waitingMethod(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+" is releasing the lock and going to wait");

        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //this is where the thread continues when notify() is called

        System.out.println(t.getName()+" got object lock back and continue its execution....");

    }
    public synchronized void sleepingMethod(){
        Thread t = Thread.currentThread();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify();

        System.out.println("A thread which is waiting for lock of this object is notified by "+t.getName());

    }
}
public class WaitNotifyExample {

    public static void main(String[] args){
        Processor processor = new Processor();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.waitingMethod();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.sleepingMethod();
            }
        });

        t1.start();
        t2.start();

    }
}
