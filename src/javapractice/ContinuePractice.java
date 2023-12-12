package javapractice;

public class ContinuePractice {

    public static void main(String...a){

        for(int i =1; i<=10; i++){

            if (i == 5 || i==8 ) {
                System.out.println("Skipping this round due to exception");
                continue;
            }

            System.out.println(i);
        }

    }

}
