package week5.session1;

import week5.session2.AccessModifier;
import week5.session2.Parent;

public class ArrayPractice extends AccessModifier {

    public static void main(String...s){

        int array[] = {100, 200, 300, 400, 500};

        String arrayStr[] = {"a", "b", "c"};

        //indexing of an array


//        for(int i=0; i<array.length; i++) {
//            System.out.println(array[i]);
//
//            for(int j=0; j<arrayStr.length; j++) {
//                System.out.print(" ");
//                System.out.println(arrayStr[j]);
//            }
//
//        }

        for(int i=0; i<arrayStr.length; i++) {
            System.out.println("For Loop Round : "+ (i+1));
            System.out.println(arrayStr[i]);

            for(int j=0; j<array.length; j++) {
                System.out.print(" ");
                System.out.println(array[j]);
            }

        }





    }


    public void accessCheck(){

//        defaultMethod();
//        privateMethod();
        publicMethod();
        protectedMethod();

    }

}
