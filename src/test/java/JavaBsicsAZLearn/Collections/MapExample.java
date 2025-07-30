package JavaBsicsAZLearn.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String args[]){

        Map<Integer,String> map = new HashMap<>();

        map.put(10,"Ayusha");
        map.put(20,"Jiya");
        map.put(30,"Riya");
        map.put(40,"Riya");
        map.put(100,"Ayusha");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
            //order is not maintained
        }
        System.out.println("\n=========LinkedHashMap=======\n");
        Map<Integer,String> linkedmap = new LinkedHashMap<>();

        linkedmap.put(10,"Ayusha");
        linkedmap.put(20,"Jiya");
        linkedmap.put(30,"Riya");
        linkedmap.put(40,"Riya");
        linkedmap.put(100,"Ayusha");

        for(Map.Entry<Integer,String> entry : linkedmap.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
            //order is  maintained
        }
        System.out.println("\n=========TreeMap=======\n");
        Map<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(67,"Ayusha");
        treeMap.put(90,"Jiya");
        treeMap.put(30,"Riya");
        treeMap.put(100,"Riya");
        treeMap.put(100,"Ayusha");

        for(Map.Entry<Integer,String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
            //order is  maintained
            //sorted Key
        }
    }
}
