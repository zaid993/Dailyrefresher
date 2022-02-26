package javaTasks.tasksFromJoseph;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

/*
3.  Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */


    public static void main(String[] args) {
        System.out.println("removeDuplicates(\"AABBCCDDDFFFF\") => " + removeDuplicates1("AABBCCDDDFFFF"));
        System.out.println("removeDuplicates2(\"AABBFGDD\") = " + removeDuplicates2("AABBFGGGGGGGGDD"));
        System.out.println("removeDuplicates3(\"AABBCCDDDFFFF\") = " + removeDuplicates("AABBCCDDDFFFF"));
        System.out.println("removeDuplicates3(\"AABBCCDDDFFFF\") = " + removeDuplicates3("AABBCCDDDFFFF"));
        System.out.println("removeDuplicates3(\"AABBCCDDDFFFF\") = " + removeDuplicates4("AABBCCDDDFFFF"));
        System.out.println("removeDuplicates3(\"AABBCCDDDFFFF\") = " + removeDuplicates5("AABBCCDDDFFFF"));
    }


    /**
     * remove duplicates using forEach loop and String methods()
     * @param str
     * @return
     */
    public static String removeDuplicates(String str){
        String result ="";
        for(char each : str.toCharArray()){
            if(!result.contains(each+"")){
                result+=each;
            }
        }
        return result;
    }


    /**
     * remove duplicates using for i loop and String methods()
     * @param str
     * @return
     */
    public static String removeDuplicates1(String str) {

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);

            }
        }
        return result;

    }

    /**
     * remove duplicates using stream()
     * @param str
     * @return
     */
    public static String removeDuplicates2(String str) {

        String[] arr = str.split("");
        String result = Arrays.stream(arr).distinct().collect(Collectors.toList()).toString().
                substring(1).replace(",", "").replace(" ", "").
                replace("]", "");

        return result;
    }

    /**
     * remove duplicates using LinkedHasSet() and String methods()
     * @param str
     * @return
     */
    public static String removeDuplicates3(String str) {
        String[] arr = str.split("");

        Set<String> s = new LinkedHashSet<>(Arrays.asList(arr));
        String result = s.toString().
                substring(1).replace(",", "").replace(" ", "").
                replace("]", "");
        return result;

    }


    /**
     * remove duplicates using LinkedHasSet() and StringBuilder()
     * @param str
     * @return
     */
    public static String removeDuplicates4(String str){

            char[] chars = str.toCharArray();
            Set<Character> set = new LinkedHashSet<>();
            for(Character each : chars){
                set.add(each);
            }
            StringBuilder str1 = new StringBuilder(set.size());
            for(Character each : set) {
                str1.append(each);
            }
            return str1.toString();

//another ending
//        String result ="";
//        for(Character each : set) {
//            result+=each;
//        }
//        return result;
    }


    /**
     *remove duplicates using indexOf() and temp variable
     * @param str
     * @return
     */

    public static  String removeDuplicates5 (String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (temp.indexOf(str.charAt(i)) == -1) { // negative
                temp = temp + str.charAt(i);
            }
        }


        return temp;
    }


}