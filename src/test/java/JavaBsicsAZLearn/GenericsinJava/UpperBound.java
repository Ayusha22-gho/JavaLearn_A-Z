package JavaBsicsAZLearn.GenericsinJava;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {

    public static void main(String args[]){

        List<String> num = new ArrayList<>();
        num.add("23.8");
        num.add("67.98");
        num.add("89.67");

        //print(num); //will not support string
    }

    public static void print(List<? extends Number> numbers){
        //making sure numbers is of type Number

        for(Number num : numbers){
            System.out.println(num);
        }
    }
}
