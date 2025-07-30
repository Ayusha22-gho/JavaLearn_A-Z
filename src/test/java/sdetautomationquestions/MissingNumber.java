package sdetautomationquestions;

import java.util.Arrays;

public class MissingNumber {
    public static int findMissing(int[] arr, int n){
        int total = n * (n+1)/2;
        for(int num : arr){
            total = total - num;
        }
        return total;
    }

    public static void main(String args[]){
        int[] arr = {1,2,4,5};
        int result = findMissing(arr,5);

        System.out.println(result);
    }
}
