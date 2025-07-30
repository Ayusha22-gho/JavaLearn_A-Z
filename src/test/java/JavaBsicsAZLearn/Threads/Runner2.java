package JavaBsicsAZLearn.Threads;

public class Runner2 implements Runnable{

//    public void doOperation(){
//        for(int i=0;i<10;i++){
//            System.out.println("Runnier2 with integer value "+i);
//        }
//    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Runnier2 with integer value "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
