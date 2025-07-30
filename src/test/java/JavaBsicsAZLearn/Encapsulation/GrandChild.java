package JavaBsicsAZLearn.Encapsulation;

public class GrandChild  extends Child{

    protected int age = 10;

    protected void travel(){
        System.out.println("Grand Child is travelling");
    }

    protected void grandChildMethod(){
        System.out.println("Grand Child Methos");
    }
}
