package JavaBsicsAZLearn.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String args[]){

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        System.out.println(hashSet.contains(20));

        linkedHashSet.add(100);
        linkedHashSet.add(33);
        linkedHashSet.add(21);
        linkedHashSet.add(300);
        linkedHashSet.add(60);

        treeSet.add(100);
        treeSet.add(33);
        treeSet.add(21);
        treeSet.add(300);
        treeSet.add(60);

        //convert hashset to treeset
        Set<Integer> sortedSet = new TreeSet<>(hashSet);

        for(Integer num : sortedSet){
            System.out.println(num);//does not maintain order
        }

//        for(Integer num : linkedHashSet){
//            System.out.println(num);//maintain order
//        }

        for(Integer num : treeSet){
            System.out.println(num);//sorted order
        }

    }
}
