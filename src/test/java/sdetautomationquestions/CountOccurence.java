package sdetautomationquestions;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

    public static void countFrequency(String str){
        Map<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }

    public static void main(String args[]){
        countFrequency("mammam");
    }
}
