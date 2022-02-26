package javaTasks.tasksFromJoseph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseString {

/*
5. Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */

    public static void main(String[] args) {
        System.out.println("reverse1(\"ABCD\") = " + reverse1("ABCD"));
        System.out.println("reverse1(\"ABCD\") = " + reverse2("ABCD"));
        System.out.println("reverse1(\"ABCD\") = " + reverse3("ABCD"));
        System.out.println("reverse1(\"ABCD\") = " + reverse4("ABCD"));
        System.out.println("reverse1(\"ABCD\") = " + reverse5("ABCD"));
    }

    /**
     * Reserve String using StringBuilder methods
     * @param str
     * @return
     */
    public static String reverse1(String str){
    String reversed = new StringBuilder(str).reverse().toString();
    return reversed;
}

    /**
     * Reserve String using for i loop
     * @param str
     * @return
     */
    public static String reverse2(String str){

        String result="";

        for(int i=str.length()-1; i>=0;i--){
            result+=str.charAt(i);

        }


        return result;
    }


    /**
     * Reserve String using Collections methods and for each loop
     * @param str
     * @return
     */
    public static String reverse3(String str){
       ArrayList<String> list = new ArrayList(Arrays.asList(str.split("")));
       Collections.reverse( list);
       String result ="";

       for(String each: list){
           result+=each;
       }

        return  result;
    }


    /**
     * Reverse String using array
     * @param str
     * @return
     */
    public static String reverse4(String str){

       char [] ch= str.toCharArray();
       String result ="";

       for(int i =ch.length-1;i>=0;i--){
           result+=ch[i];
       }
       return result;
    }


    /**
     * Reserve String using StringBuffer methods
     * @param str
     * @return
     */
    public static String reverse5(String str){
        StringBuffer outcome = new StringBuffer(str);
        outcome.reverse();
        return outcome.toString();
    }


}
