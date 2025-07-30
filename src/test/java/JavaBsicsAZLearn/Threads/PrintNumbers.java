package JavaBsicsAZLearn.Threads;

public class PrintNumbers {

    //editable
    private int current;
    private int n;

    PrintNumbers(int n){
       //editable
        this.n = n;
        this.current = 1;

        Thread t1 = new Thread(()->runTask(1));
        Thread t2 = new Thread(()->runTask(2));
        Thread t3 = new Thread(()->runTask(3));
        t1.start();
        t2.start();
        t3.start();

//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    private synchronized void runTask(int threadId){
        while(true){
           // System.out.println("current " +current%3+ " thread id "+ "  "+threadId);
            if(current > n){
                notifyAll();
                break;
            }
            if((current % 3 ==0 && threadId !=3)||
                    (current % 3 ==1 && threadId!=1) ||
                    (current % 3 ==2 && threadId !=2)){
                    try{
                        wait();

                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                    continue;
            }

                System.out.println(current+ " ");
                current++;
                notifyAll();


        }
    }

    public static void main(String[] args){
        PrintNumbers printNumbers = new PrintNumbers(10);
        //non editable
    }
}
