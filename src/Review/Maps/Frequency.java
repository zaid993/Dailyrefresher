package Review.Maps;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {

       String str = "aabbbccccddddd";

        Map <String,Integer> freq = new HashMap<>();


        for (String each : str.split("")) {

            freq.put(each,Collections.frequency(Arrays.asList(str.split("")), each));
        }

        System.out.println(freq);


        System.out.println("frq(\"aaasssddd\") = " + frq("aaasssddd"));

        System.out.println("repeats(\"aaasss\") = " + repeats("aaasss"));
    }

    public static Map frq(String st){

        Map<String, Integer> map = new HashMap<>();

        for (String eachChar : st.split("")) {
            map.put(eachChar,Collections.frequency(Arrays.asList(st.split("")),eachChar));
        }
        return map;

    }


    public static String repeats(String str){
        String res = "";

        //remove duplicates
        String removedDups="";
        for (int i = 0; i < str.length(); i++) {
        if (!removedDups.contains(""+str.charAt(i)))  {
            removedDups+=str.charAt(i);
        }
        }

        for (int j = 0; j < removedDups.length(); j++) {
            // we will try to know the coubt of the first one
            char ch1 = removedDups.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch1==str.charAt(i)){
                    count++;
                }
            }
            res+=""+ch1+count;
        }

        return res;

    }







}