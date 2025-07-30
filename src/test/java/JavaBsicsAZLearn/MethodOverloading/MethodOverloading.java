package JavaBsicsAZLearn.MethodOverloading;

public class MethodOverloading {


    public static void main(String args[]){

        System.out.println(add(5,10));
        System.out.println(add(67.34,90.32));


        System.out.println(add(6,234,890));
    }

    static int add(int num1, int num2){
        return num1+num2;
    }

    //changing data type
    static double add(double num1, double num2){
        return num1+num2;
    }

    //changing parameters
    static int add(int num1, int num2,int num3){
        return num1+num2+num3;
    }
}
