package week5.session1;

public class ParameterizedMethods {

    public static void main(String ...s){

        sum(100, 200);
        sum(200, 300);
        sum(400, 500);
        sum(500, 600);

    }



    public static void sum(){
        int a =100;
        int b =200;
        int sum = a+b;
        System.out.println("addition of 2 digit is define as - " + sum);
    }


    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println("addition of 2 digit is define as - " + sum);
    }




    public static void multiplication(){
        int a =100;
        int b =200;
        int mul = a*b;
        System.out.println("addition of 2 digit  " + mul);

    }

}
