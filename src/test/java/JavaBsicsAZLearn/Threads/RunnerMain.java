package JavaBsicsAZLearn.Threads;

public class RunnerMain {

    public static void main(String[] args) throws InterruptedException {

        //sequential execution : the tasks executed one after the other

//        Runner1 runner1 = new Runner1();
//        Runner2 runner2 = new Runner2();
//
//        runner1.doOperation();
//        runner2.doOperation();

        //Running both threads in concurrent manner
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner2());
        t1.start();
        //t1.join();//not executed t2 until the t1 is completed
        //t2.join();
        t2.start();
    }
}
