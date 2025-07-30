package JavaBsicsAZLearn.Abstraction;

public interface AnotherInterface {

    default void defaultMethod(){
        System.out.println("Default method in AnotherInterface");
    }
}
