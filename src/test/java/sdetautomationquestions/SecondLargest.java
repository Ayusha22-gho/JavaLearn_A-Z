package sdetautomationquestions;

import java.util.Arrays;

public class SecondLargest {

    public static int findSecondLargest(int[] arr){
        // 5 6 4 5 8 9 2 12  -> second largest is 9
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int largest = arr.length-1;
        int secondLargest = -1;
        for(int i = largest-1;i>=0;i--){
            if(arr[i] < largest){
                secondLargest = arr[i];
                break;
            }
        }
        if(secondLargest != -1){
            return secondLargest;
        }
        return -1;


    }
    public static int findSecondLargestNew(int[] arr){
        //int[] arr = {5,7,12,9,3,33};
        // largest    5 7 12 33
        //secondLargest MIN 5 7 9 12
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String args[]){
        int[] arr = {5,6,4,5,8,9,2,12};
         int result = findSecondLargest(arr);
         int ans = findSecondLargestNew(arr);
         System.out.println(ans);

    }
}
