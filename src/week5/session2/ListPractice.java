package week5.session2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String...s){

        int array[] = {100, 200, 300, 400, 500};

        List<String> listOfValues = new ArrayList<String>();

        listOfValues.add("Newyork");
        listOfValues.add("California");
        listOfValues.add("Manchaster");
        listOfValues.add("Boston");
        listOfValues.add("Newyork");
        listOfValues.add("California");
        listOfValues.add("Manchaster");
        listOfValues.add("Boston");
        listOfValues.add("Newyork");
        listOfValues.add("California");
        listOfValues.add("Manchaster");
        listOfValues.add("Boston");

        //listOfValues.get(2);

        for(String value: listOfValues ){
            System.out.println("The Name Of City/State " + value);
        }

        //System.out.println(listOfValues.get(0));


    }


}
