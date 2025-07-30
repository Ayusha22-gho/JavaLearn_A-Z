package JavaBsicsAZLearn.Threads;

public class App {
    public static void main(String[] args){
        Thread t1 = new Thread(new ThreadExample());
        t1.start();
        int numOfThreads = 6;
        for(int i=0;i<numOfThreads;i++){
            Thread t = new Thread(new ThreadExample());
            t.start();
        }

        System.out.println("\nExtending Thread Class\n");

        for(int i=0;i<numOfThreads;i++){
            Thread t = new ThreadExample1();
            t.start();
        }

    }
}
