package stringconceptsUnderstanding;

import java.util.Arrays;

public class ReverseWords {
    public static void reverseWords(String input){
        String[] str = input.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : str){
            StringBuilder reverse = new StringBuilder(word);
            reverse.reverse().toString();
           // System.out.println(reverse);
            result.append(reverse).append(" ");
        }
        System.out.println(result);
    }
    public static void main(String args[]){
        reverseWords("Hello my name is Ayusha");
    }
}
