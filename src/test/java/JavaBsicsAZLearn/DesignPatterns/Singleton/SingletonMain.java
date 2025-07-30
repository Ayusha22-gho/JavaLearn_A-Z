package JavaBsicsAZLearn.DesignPatterns.Singleton;

public class SingletonMain {
/**
 *  -> singleton pattern restricts the instantiation of a class and ensures that only
 *      one instance of the class exists in the JVM
 *
 *  -> singleton class must provide global access point to get the instance of the class
 *
 *  ->singleton pattern is used for logging, drivers objects , caching an and thread pool
 * **/
    public static void main(String[] args){

        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.show();
        //there will be no issue if multiple threads manipulate
        //the singleton class at the same time


    }
}
