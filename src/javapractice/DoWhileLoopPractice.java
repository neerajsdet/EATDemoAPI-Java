package javapractice;

public class DoWhileLoopPractice {


    public static void main(String...a){

        int count =100;

        while(count>1000){
            count = count-5;
            System.out.println(count);
        }

        do{
            count = count-5;
            System.out.println(count);
        }while (count>1000);

    }

}
