package week5.session1;

public class ReturnTypeMethods {

    public static void main(String ...s){

        System.out.println("Adding 1000 and 2000 is equals to " + sum(1000, 2000));
        System.out.println("Adding 5000 and 6000 is equals to " + sum(1000, 2000));
        System.out.println("Adding 7000 and 8000 is equals to " + sum(1000, 2000));


    }


//    public static void sum(int a, int b){
//        int sum = a+b;
//        System.out.println("addition of 2 digit is define as - " + sum);
//    }

    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }





}
