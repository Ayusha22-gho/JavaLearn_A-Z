package JavaBsicsAZLearn.LamdaExpressions.FunctionalInterface;

@FunctionalInterface
public interface Sum {

    //SAM
    int add(int num1,int num2);

    //can have as many static and default method
    static void staticMethod(){
        System.out.println("Static method in interface");
    }

    default void defaultMethod(){
        System.out.println("Default method in interface");
    }
}
