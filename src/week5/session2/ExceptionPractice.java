package week5.session2;

public class ExceptionPractice {
    public static void main(String...s){

        int a=1000;
        int b=0;

        try {
            int div = a/b;
            System.out.println("Div Result is --- " + div);
        }catch (ArithmeticException e){
            System.out.println("Exception Handled Successfully");
        }


        System.out.println("Thanks for calculations");

    }

}
