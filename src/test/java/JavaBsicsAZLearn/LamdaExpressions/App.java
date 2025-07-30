package JavaBsicsAZLearn.LamdaExpressions;

public class App {

    public static void main(String[] args){
//        Sum sum = new Sum() {
//
//            @Override
//            public int add(int num1, int num2) {
//                return num1 + num2;
//            }
//        };
//
//        System.out.println(sum.add(5,1));

        Sum sum = ( num1, num2) -> num1 + num2;
        //Sum sum = (int num1, int num2) -> {return num1+num2;}

        System.out.println(sum.add(10,80));

        Greetings greeting = () -> System.out.println("Hello world via lambda expressions..");
        greeting.sayHello();

        GreetParam greetParam = msg -> System.out.println("Hello "+msg);
        greetParam.sayHelloHi("Java");
    }
}
