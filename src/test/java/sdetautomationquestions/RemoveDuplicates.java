package sdetautomationquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr){
        //4 5 6 7 8 8 9 9
        Set<Integer> set = new HashSet<>(); //stores unique value
        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);
        int[] result = new int[set.size()];
        int i=0;
        for(int num : set){
            result[i] = num;
            i++;

        }
        return result;

    }
    public static void main(String args[]){
        int[] arr = {1,4,4,5,6,7,7};
        int[] result = removeDuplicates(arr);

        System.out.println(Arrays.toString(result));
    }
}
