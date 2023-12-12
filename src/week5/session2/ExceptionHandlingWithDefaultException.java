package week5.session2;

public class ExceptionHandlingWithDefaultException {

    public static void main(String...s){
        int num =10;
        int array[] = {100, 200, 300, 400, 500};

        try {
            for (int i = 0; i < num; i++) {
                System.out.println(array[i]);
            }

        }catch (ArithmeticException e){
            System.out.println("hi - I'm in Specific exception block");
            num = array.length;
            for (int i = 0; i < num; i++) {
                System.out.println(array[i]);
            }

        }catch (Exception e1){
            System.out.println("hi - I'm in General exception block");
            System.out.println("Exception handled successfully");
        }

        System.out.println("My Program has successfully Executed");
    }
}
