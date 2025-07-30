package JavaBsicsAZLearn.NestedInterface;

public class App implements OuterInterface.NestedInterface , OuterClass.NestedClassInterface{

    public static void main(String[] args){

        //Polymorphism
        //reference type is interface but the object type is implementing class
        //allows flexibility, can change app to something else without changing much code

        OuterInterface.NestedInterface msg = new App();
        msg.messageInside();//this has to present in the interface
        //msg.appMethod() ----- X Invalid!
        OuterClass.NestedClassInterface show = new App();
        show.show();

        App app = new App();
        app.AppMethod();
    }

    @Override
    public void messageInside() {
        System.out.println("This is a method within nested interface");
    }

    @Override
    public void show() {
        System.out.println("This is a show method within nested class");

    }

    public void AppMethod(){
        System.out.println("This is aN App method");

    }
}
