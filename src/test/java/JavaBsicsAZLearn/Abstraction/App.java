package JavaBsicsAZLearn.Abstraction;

public class App implements ModernInterface, AnotherInterface {

    public static void main(String[] args){

        App app = new App();
        app.abstractMethod();

        ModernInterface.staticMethod(); //since static
        app.defaultMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract interface method from App class");
    }

    @Override
    public void defaultMethod() {
        AnotherInterface.super.defaultMethod();
        ModernInterface.super.defaultMethod();
    }
}
