package javapractice;

public class WhileLoopPractice {


    public static void main(String...a){

        int count1 = 100;



        for (int i=0; i<10; i++){
            count1 = count1 - 5;
            System.out.println("using for loop- " + count1);

        }


        int count2 = 100;
        while (count2>0) {
            count2 = count2 - 5;
            System.out.println("using while loop- " + count2);

        }




    }

}
