package javaTasks.tasksFromJoseph;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FrequencyOfChars {

   /*
    1. Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */


    public static void main(String[] args) {
        System.out.println("frequency(\"bfbbgfffsgttst\") = " + frequency("bfbbgfffsgttst"));
        System.out.println("frequency(\"bfbbgfffsgttst\") = " + frequency1("bfbbgfffsgttst"));

//        System.out.println("frequencyOfChar(\"AAABBCDD\") = "
//                + frequency("AAABBCDD"));
//
//        System.out.println("frequency1(\"AAABBCDD\") = " + frequency1("AAABBCDD"));
    }

    /**
     * removes duplicates from String
     * @param str
     * @return
     */
    public static String removeDuplicates(String str){
        String nonDuplicatedStr ="";

        for(int i = 0; i<str.length()-1;i++){
            if(!nonDuplicatedStr.contains(""+str.charAt(i))){
                nonDuplicatedStr+=str.charAt(i);
            }
        }
        return nonDuplicatedStr;
    }


    /**
     * returns frequency of one char in the string
     * @param str
     * @param ch
     * @return
     */
    public static int frequencyOfOneChar(String str,char ch){


        String result="";
        int frequency =0;

            for(int j = 0; j<str.length();j++){

                if(ch==str.charAt(j)){
                    frequency++;
                }

            }

        return frequency;

    }

    /**
     * returns frequency of each char in given string using created above methods
     * @param str
     * @return
     */
    public static String frequency(String str){
        String result="";

      for(  char ch : removeDuplicates(str).toCharArray()){

          result += "" +ch + frequencyOfOneChar(str,ch);



      }
      return result;
    }

    /**
     * returns frequency of each chars in String using Collections.frequency()
     * @param str
     * @return
     */
    public static String frequency1(String str){

       String result ="";

    // ch: non-duplicated characters ==> a b c d e

        for (String ch : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += ch + Collections.frequency( Arrays.asList(str.split("")) ,  ch) ;
        }

       return result;

    }


    /**
     * frequency of each char using while and for i loops
     * @param str
     * @return
     */
    public static String frequency2(String str){
        String result = "";
        int j=0;
        while (j<str.length()){
            int frequency = 0;
            for (int i = 0; i<str.length(); i++){
                if(str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
            }
            result+=str.charAt(j)+""+frequency;
            str = str.replace(""+str.charAt(j), "");
        }
        return result;
    }





}
