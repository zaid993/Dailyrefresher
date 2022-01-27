package JavaR.Methods;

import java.util.Arrays;

public class AnagramMethod {
    public static void main(String[] args) {
        System.out.println("isAnagram(\"listen\",\"silent\") = " + isAnagram("listen", "silent"));


        System.out.println("isAnagram(\"earth\",\"heart\") = " + isAnagram("earth", "heart"));



    }



    public static boolean isAnagram(String str1, String str2){
        //take each one of them and sort it
        //we only know how to sort in arrays
        // so we have to get array and sort each character of the words to compare

        char[] ch1 =str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean isAnagram = Arrays.equals(ch1,ch2);
        return isAnagram;
    }



}
