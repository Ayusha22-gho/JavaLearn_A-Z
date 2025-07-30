package JavaBsicsAZLearn.Abstraction;

public interface ModernInterface {

    //classic interface method (abstract method)
    void abstractMethod();

    //static method
    static void staticMethod() {
        System.out.println("Static method in an interface");
    }

    default void defaultMethod(){
        System.out.println("Default method in interface");
    }


}
