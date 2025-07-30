package JavaBsicsAZLearn.GenericsinJava;

public class GenericsMethod {

    public static void main(String args[]){
        String[] names = {"Adam","Kevin","Joe"};
        Integer[] nums = {10,20,30,40}; //we have to use wrapper class
        Character[] chars = {'A','c','D'};

        printArray(names,nums);
        printArray(names,chars);
    }

    //Generics

    public static <T,V> void printArray(T[] t,V[] v){
        for(T value : t){
            System.out.println(value);
        }

        for(V value : v){
            System.out.println(value);
        }
    }
}
