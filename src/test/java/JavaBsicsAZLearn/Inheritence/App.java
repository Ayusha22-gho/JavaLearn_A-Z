package JavaBsicsAZLearn.Inheritence;

public class App {

    public static void main(String[] args){
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //Multilevel Inheritance
        GrandChild grandChild = new GrandChild();
        grandChild.grandChildMethod();
        grandChild.childMethod();
        grandChild.parentMethod();

        MultipleInheritence multi = new MultipleInheritence();
        multi.interfaceMethod1();
        multi.interfaceMethod2();

        System.out.println("\n=======Hybrid====\n");
        HybridClass hybridClass = new HybridClass();
        hybridClass.interfaceMethod1();
        hybridClass.interfaceMethod2();
        hybridClass.parentMethod();
    }
}
