package week5.session2;

public class ExceptionHandlingWithArray {
    public static void main(String...s){

        int array[] = {100, 200, 300, 400, 500};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception handled successfully");
        }


        System.out.println("My Program has successfully Executed");
    }

}
