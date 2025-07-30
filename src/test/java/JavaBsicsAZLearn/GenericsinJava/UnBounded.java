package JavaBsicsAZLearn.GenericsinJava;

import java.util.ArrayList;
import java.util.List;

public class UnBounded {

    public static void main(String args[]){
      List<Integer> num = new ArrayList<>();
      num.add(10);
      num.add(45);

        List<String> names = new ArrayList<>();
        names.add("ayusha");
        names.add("ajit");


        printAll(num);
        printAll(names);
    }

    public static void printAll(List<?> list){

        for(Object item : list){
            System.out.println(item);
        }

    }
}
