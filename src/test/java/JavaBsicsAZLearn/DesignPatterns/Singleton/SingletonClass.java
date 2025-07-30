package JavaBsicsAZLearn.DesignPatterns.Singleton;

public class SingletonClass {
    //Early or eager instantiation at compile time is not always a good method for thread safety
    //private static volatile SingletonClass singletonClass = new SingletonClass();
    private static volatile SingletonClass singletonClass = null;

    private  SingletonClass(){
        //private condtructor restricts instantiation of class
    }


    public  static SingletonClass getInstance(){
       // return singletonClass;

        //lazy instantiation at run time
        if(singletonClass==null){

            //ensuring this is thread safe

            synchronized (SingletonClass.class){
                //threads are going to stay here and maybe a
                //thread already instantiated the class so we
                //are doing if check again
                if(singletonClass==null)
                    singletonClass = new SingletonClass();
            }

        }
        return singletonClass;

    }

    public void show(){
        System.out.println("This is the show() method of Singleton class.....");


    }
}
