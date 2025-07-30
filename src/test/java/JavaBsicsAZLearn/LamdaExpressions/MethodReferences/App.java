package JavaBsicsAZLearn.LamdaExpressions.MethodReferences;

import java.util.Arrays;

interface FunctionalInterface{
    void show();
}

interface FunctionalInterface1{
    MessageClass showMessage(String str);
}
public class App {
    /**
     * Method Reference
     *
     * 1) Reference to a Static Method
     * 2) Reference to an Instance Method of a particular type
     * 3) Reference to an Instance Method of an arbitrary object of a particular type
     * 4) Reference to a constructor
     *
     **/
    public static void main(String[] args){

    // 1.
    FunctionalInterface functionalInterface = App::staticGreeting;
    functionalInterface.show();

    //2.
        App app = new App();
        FunctionalInterface functionalInterface1 = app::instanceGreeting;
        //FunctionalInterface functionalInterface1 = new App() ::instanceGreeting;
        functionalInterface1.show();

      //3
      String[] names = {"Kevin","Kate","Adam","Philip","Joe"};
        Arrays.sort(names,String:: compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

       //4
        FunctionalInterface1 functionalInterface11 = MessageClass::new;
        functionalInterface11.showMessage("This is a message");
    }

    public static void staticGreeting(){
        System.out.println("Greeting from static method...");
    }

    public void instanceGreeting(){
        System.out.println("Greeting from Instance method...");
    }
}
