package sdetautomationquestions;

public class PallindromeCheck {

    public static boolean palindromeCheck(String input){
        //malayalam
        int i =0;
        int j = input.length()-1;
        while (i<j){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void checkPalindrome(String original){
        String reversed = "";
        for(int i = original.length()-1;i>=0;i--){
            reversed += original.charAt(i);
        }
        if(original.equals(reversed)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    public static void checkPalindromeBuilder(String original){
        String reversed = new StringBuilder(original).reverse().toString();
        if(original.equals(reversed)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    public static void main(String args[]){
        boolean result = palindromeCheck("mammam");
        checkPalindromeBuilder("racecar");

        System.out.println(result);
    }
}
