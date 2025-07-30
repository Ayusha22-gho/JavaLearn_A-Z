package sdetautomationquestions;

public class ArrayLeftShift {

    public static void arrayLeftShift(int[] arr, int k){
        // a = [3, 0, 7, 9, 4, 1, 2];
        //      0  1  2  3  4  5  6
        //
        //k=3 //n-k = 7-3 = 4
        int n = arr.length;
        int[] temp = new int[n];

        for(int i = 0;i<n-k-1;i++){
            // 0 1 
            // 9 4 5
            // 4 1 2
            temp[i] = arr[i + n-k];
        }

        for(int i=k;i<n;i++){
            // 3 4 5 6
            // 3 0 7 9
            temp[i] = arr[i - (n-k-1)];
        }
        for (int num : temp){
            System.out.print(num+" ");
        }
    }

    public static void main(String args[]){
        //int[] arr = {3, 0, 7, 9, 4, 1, 2};
        int[] arr = {8, 1, 7, 0, 6, 4, 9};
        // n-k = 7-4 = 3
        arrayLeftShift(arr,4);
    }
}
