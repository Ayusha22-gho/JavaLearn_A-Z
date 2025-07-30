package sdetautomationquestions;

public class ReverseString {
    public static String reverseString(String str){
        String result = "";
        for(int i = str.length()-1;i>=0;i--){
            //hello
            //01234
            result = result + str.charAt(i);
        }

        return result;
    }

    public static void main(String args[]){
        String result = reverseString("hello");

        System.out.println(result);
    }
}
