package Maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {

       String str = "aabbbccccddddd";

        Map <String,Integer> freq = new LinkedHashMap<>();


        for (String each : str.split("")) {

            freq.put(each, Collections.frequency(Arrays.asList(str.split("")), each));
        }

        System.out.println(freq);











    }
}
