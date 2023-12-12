package javapractice;

public class FactorialProgram {

    public static void main(String...a){

        int fact =1;

        int factorialNumber = 4;


        for (int i=factorialNumber; i>=1 ; i--){
            fact = fact * i;
        }

        System.out.println("Factorial for given number is :  " + fact);
    }





}
