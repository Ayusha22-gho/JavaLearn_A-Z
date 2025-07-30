package JavaBsicsAZLearn.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args){

        List<String> names = Arrays.asList("Adam","Kevin","Vanessa","Puja","Aarti");

        List<String> filteredNames =
                names.stream().filter(name -> name.startsWith("A"))
                        .collect(Collectors.toList());
                        //.forEach(System.out::println); void return type

        Stream<String> stream =  names.stream().filter(name -> name.startsWith("A"));

        filteredNames.forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
