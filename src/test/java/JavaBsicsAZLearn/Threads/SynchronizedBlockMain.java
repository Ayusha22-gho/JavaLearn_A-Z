package JavaBsicsAZLearn.Threads;

class ShowNumbers{
    public void printNumbers(int n)  {
        System.out.println("Number starting with "+n);

        //the lock is acquired on critical part of code only
        //performance better
        synchronized (this){
            for(int i=1;i<=5;i++){
                System.out.println(i*n);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }


    }
}

class RunnerNew1 extends Thread{

    ShowNumbers showNumbers;

    RunnerNew1(ShowNumbers showNumbers){
        this.showNumbers = showNumbers;
    }
    @Override
    public void run() {
        showNumbers.printNumbers(1);
    }
}
class RunnerNew2 extends Thread{

    ShowNumbers showNumbers;

    RunnerNew2(ShowNumbers showNumbers){
        this.showNumbers = showNumbers;
    }
    @Override
    public void run() {
        showNumbers.printNumbers(10);
    }
}
public class SynchronizedBlockMain {


    public static void main(String[] args){
        ShowNumbers showNumbers = new ShowNumbers();
        Thread t1 = new RunnerNew1(showNumbers);
        Thread t2 = new RunnerNew2(showNumbers);

        t1.start();
        t2.start();

    }
}
