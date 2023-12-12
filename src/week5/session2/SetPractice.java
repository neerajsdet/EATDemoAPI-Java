package week5.session2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {

    public static void main(String...s){

        int array[] = {100, 200, 300, 400, 500};

        Set<String> setOfValues = new HashSet<String>();

        setOfValues.add("Newyork");
        setOfValues.add("California");
        setOfValues.add("Manchaster");
        setOfValues.add("Boston");
        setOfValues.add("Newyork");
        setOfValues.add("California");
        setOfValues.add("Manchaster");
        setOfValues.add("Boston");


        //listOfValues.get(2);

        for(String value: setOfValues ){
            System.out.println("The Name Of City/State " + value);
        }

        //System.out.println(listOfValues.get(0));


    }


}
