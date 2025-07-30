package JavaBsicsAZLearn.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args){
        //of
        Stream.of("item1","item2","item3")
                .findFirst().ifPresent(System.out::println);

        //count
        List<String> names = Arrays.asList("Adam","Kevin","Vanessa","Puja","Aarti");
        System.out.println(names.stream().filter(name-> name.startsWith("A")).count());

        //iterate
        Stream<Integer> numbers = Stream.iterate(1,n->n+5).limit(10);
        numbers.forEach(n->System.out.print(n+" "));

        //generate
        Stream<Double> num = Stream.generate(Math::random).limit(5);
        num.forEach(System.out::println);

        //reduce
        String[] title = {"This","is", "just", "an", "example"};
        //converting array to stream
        Stream<String> titleStream = Arrays.stream(title);
        Optional<String> result = titleStream.reduce((word1, word2)->word1+"-"+word2);
        System.out.println(result.get());

        //map
        List<String> words = Arrays.asList("this","is","again","an","example");
        words.stream().map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

        //flatMap
        List<String> femaleNames = Arrays.asList("Ayusha","Jiya","Sush");
        List<String> maleNames = Arrays.asList("Kevin","Peter","Joe");

        List<List<String>> combinedNames = Arrays.asList(femaleNames,maleNames);
        System.out.println(combinedNames);//in this case we have a list of list
        //in such case we cannot use map , we will use flatMap

        combinedNames.stream().flatMap(list -> list.stream())
                .collect(Collectors.toList()).forEach(System.out::println);



    }
}
