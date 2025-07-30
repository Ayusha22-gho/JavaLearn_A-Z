package JavaBsicsAZLearn.GenericsinJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBound {

    public static void main(String args[]){
        //can be a type of
        //Integer | Number | Object -> they are superclass of Number
        List<Object> list1 = new ArrayList<>();
        list1.add(89);

        addAndPrint(list1);
    }

    public static void addAndPrint(List<? super Integer> list){

        list.add(10);
        list.add(45);
        list.add(67);

        System.out.println(Arrays.toString(list.toArray()));
    }
}
