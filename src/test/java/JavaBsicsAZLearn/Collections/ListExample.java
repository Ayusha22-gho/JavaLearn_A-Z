package JavaBsicsAZLearn.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String args[]){

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("ayusha");
        arrayList.add("Jiya");
        arrayList.add("Sush");

        linkedList.add("Riya");
        linkedList.add("Mantu");
        linkedList.add("Sumitra");

        Iterator<String> arrayIterator = arrayList.iterator();
        System.out.println("Arraylist elements " );
        while (arrayIterator.hasNext()){
            System.out.println(arrayIterator.next());
        }

        System.out.println("Linkedlist elements " );

        //we are able to use a simple loop because linkedList
        //implements the Iterator interface which give the
        //ability o iterate
        for(String s : linkedList){
            System.out.println(s);
        }
    }
}
