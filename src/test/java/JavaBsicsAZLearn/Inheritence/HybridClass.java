package JavaBsicsAZLearn.Inheritence;

public class HybridClass extends Parent implements Interface3{
    @Override
    public void interfaceMethod1() {
        System.out.println("This is interface 1");
    }

    @Override
    public void interfaceMethod2() {
        System.out.println("This is interface 2");
    }

    @Override
    protected void parentMethod(){
        System.out.println("This is parent class.....");
    }
}
