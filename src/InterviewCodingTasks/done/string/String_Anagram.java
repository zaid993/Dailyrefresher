package InterviewCodingTasks.done.string;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {
    public static void main(String[] args) {

        String st = "listen";
        String st2 = "silent";

        System.out.println("Ana(st,st2) = " + Ana(st, st2));


    }




    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */

    // solution 1:
    public boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }

        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);
    }


    // solution 2
    public boolean Same(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }



    //solution
    public static boolean Ana(String s1 , String s2){
        boolean anagram=false;
        char[] ch1 =s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        anagram=Arrays.equals(ch1,ch2);
        return anagram;
    }


}
