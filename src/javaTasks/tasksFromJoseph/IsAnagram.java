package javaTasks.tasksFromJoseph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class IsAnagram {

    public static void main(String[] args) {

        System.out.println("isAnagram1(\"abc\",\"cba\") = " + isAnagram1("abc", "cba"));
        System.out.println("isAnagram2(\"abc\", \"cba\") = " + isAnagram2("abcc", "cabc"));
        System.out.println("isAnagram3(\"asdf\",\"fdas\") = " + isAnagram3("akdf", "fdak"));

        System.out.println(isAnagram2("aa bc", "c aba"));

    }

    /**
     * Method uses Arrays.sort()
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagram1(String str1, String str2){

      String [] arr1 = str1.split("");
       String [] arr2 = str2.split("");
       Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }


    /**
     * Method uses String manipulations
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagram2(String str1, String str2){


        boolean isAng=false;

        if(str1.length()==str2.length()){
            for(int i=0; i<str2.length();i++){
                if(str1.contains(""+str2.charAt(i))){

                  isAng= true;
                  str1=  str1.replaceFirst(""+str2.charAt(i),"");

                }else{
                   isAng= false;
                    break;
                }
            }

        }

        return isAng;
    }


    /**
     * Method uses Collections.sort()
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagram3(String str1, String str2){

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list1);
        Collections.sort(list2);

        return  list1.equals(list2);


    }

}
