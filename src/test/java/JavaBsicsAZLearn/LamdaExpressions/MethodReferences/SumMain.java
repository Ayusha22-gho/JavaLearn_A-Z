package JavaBsicsAZLearn.LamdaExpressions.MethodReferences;

public class SumMain {

    public static void main(String[] args){

        //lamda expression
        Sum sum = (num1,num2)-> add(num1,num2);
        System.out.println(sum.addition(10,34));

        //method reference
        Sum sum1 = SumMain::add;
        System.out.println(sum1.addition(30,40));

        //THIS IS THE MAIN ADVANTAGE OF LAMDA
        //WE CAN CHAIN OPERATIONS

        Sum sum2 = (num1,num2)-> add(num1,increment(num2));
        System.out.println(sum2.addition(10,67));

        //We are not able to do same with method reference
        //App::add(num1,num2)::increment ----- xxxx wrong
    }

    static int add(int num1,int num2){
        return num1+num2;
    }

    static int increment(int x){
        x = x+10;
        return x;
    }
}
