package JavaBsicsAZLearn.LamdaExpressions.FunctionalInterface;

import java.util.function.*;

public class App {

    public static void main(String[] args){

        Sum sum = (num1, num2) -> num1+num2;

        System.out.println(sum.add(40,80));

        //Predefined Functional Interface - Consumer<T>
        //Accepts single argument and returns no result

        Consumer<String> cons = (str) -> System.out.println(str.toUpperCase());
        cons.accept("Hi my Name is AyuSha Ghosh");

        //Predicate<T> takes boolean value argument
        Predicate<Integer> x = a -> a>10;
        System.out.println(x.test(21));

        //UnaryOperator<T> operation on single operand and returns a result of same type of operand
        UnaryOperator<String> str = s->s.toLowerCase();
        System.out.println(str.apply("HELLO EVERYONE!"));

        //Supplier<T> no input and output is expected
        Supplier<Double> random = ()->Math.random();
        System.out.println(random.get());

        //Function<T,R>  accepts one arg and return result
        Function<String,String> fun = s -> message(s);
        System.out.println(fun.apply("World"));

    }

    static String message(String s){
        return "Hello "+ s;

    }

}
