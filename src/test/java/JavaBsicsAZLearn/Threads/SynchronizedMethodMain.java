package JavaBsicsAZLearn.Threads;

public class SynchronizedMethodMain {

    private static int counter =0;

    public synchronized static void doOperation(){
        //solving different equation
        //independent
        //this thread must wait for increment method to complete
    }

    public synchronized static void increment(){
        //second thread has to wait before the first thread
        //completes the execution
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    increment();
                }
            }
        }) ;
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    increment();
                }
            }
        }) ;

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter);

    }
}
