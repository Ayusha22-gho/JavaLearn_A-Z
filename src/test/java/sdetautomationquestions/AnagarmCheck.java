package sdetautomationquestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagarmCheck {
    public static boolean isAnagram(String str1 , String str2){
        //hello
        //oehll
        if(str1.length() != str2.length()) return false;
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }

    public static void main(String args[]){
        boolean result = isAnagram("hello","ollhe");
        System.out.println(result);
    }
}
