package week5.session1;

public class MethodOverLoadingPractice {

    public static void main(String...s){

        sum(1000, 2000);
        sum(1000, 2000, 3000);
        sum(1000,2000,3000,4000);

    }



    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println("Sum of 2 digits is : " + sum);
    }

    public static void sum(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("Sum of 3 digits is : " + sum);
    }

    public static void sum(int a, int b, int c, int d){
        int sum = a+b+c+d;
        System.out.println("Sum of 4 digits is : " + sum);
    }


    public static void sumAbs(int a, int b){
        int sum = a+b;
        System.out.println("Sum of 2 digits is : " + sum);
    }

    public static void sumBsz(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("Sum of 3 digits is : " + sum);
    }

    public static void sumAsy(int a, int b, int c, int d){
        int sum = a+b+c+d;
        System.out.println("Sum of 4 digits is : " + sum);
    }


}

