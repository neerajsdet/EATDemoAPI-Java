package week5.session2;

public class ThrowsPractice {

    public static void main(String...a){
        div(500, 100);
        div(5000, 100);
        div(500, 0);
        div(3000, 100);
        div(4000, 100);
    }


    public static void div(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
}
