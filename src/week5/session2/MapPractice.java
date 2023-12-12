package week5.session2;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String...s) {

        Map<Integer, String> ssnData = new HashMap<Integer, String>();

        ssnData.put(101, "bob");
        ssnData.put(102, "James");
        ssnData.put(103, "Carry");
        ssnData.put(104, "Nick");
        ssnData.put(105, "Arina");
        ssnData.put(106, "bob");

        Map<Integer, String> mobileNumber = new HashMap<Integer, String>();

        mobileNumber.put(101748, "bob");
        mobileNumber.put(102873, "James");
        mobileNumber.put(103787, "Carry");
        mobileNumber.put(104837, "Nick");
        mobileNumber.put(105438, "Arina");
        mobileNumber.put(106438, "bob");


        System.out.println(ssnData.get(106));
        System.out.println(mobileNumber.get(103787));



    }
}

