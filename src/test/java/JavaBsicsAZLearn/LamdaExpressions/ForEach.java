package JavaBsicsAZLearn.LamdaExpressions;

import java.util.*;

public class ForEach {

    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("bcjdsc");
        names.add("clsdc");
        names.add("l;dsad");
        names.add("hswqd");

        names.forEach(s->System.out.println(s));
        //method reference
        names.forEach(System.out::println);

        Set<String> set = new HashSet<>(Arrays.asList("jdie1","fnrj2","fujs3"));

        set.forEach(s->System.out.println(s));
        set.forEach(System.out::println);

        Map<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("C",32);
        map.put("B",78);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
        map.forEach((key,value)-> System.out.println(key+" "+value));

        //Method reference
        //map.forEach(System.out::println);
        //Error :The type Printstream does nott define println(String,Integer) that is applicable here




    }
}
