package urgentNeed;

import java.util.*;

public class Coding {
    public static void main(String[] args) {

        int [] n = {1,2,3,4};

        Map<Integer,String> map = new LinkedHashMap<>();


        for (String each : n.toString().split("")) {
            map.put(each,Collections.frequency(n.toString().split("")),each);
        }


        }



    }


    
}
