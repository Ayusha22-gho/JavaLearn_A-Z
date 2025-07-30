package sdetautomationquestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static Set<Integer> findDuplicates(int[] arr){
        //1 5 6 1 1 55 89 55 3 5 55
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        return duplicate;

    }
    public static void main(String args[]){
        int[] arr = {1, 5, 6, 1, 1, 55, 89, 55, 3, 5, 55};
        Set<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }
}
