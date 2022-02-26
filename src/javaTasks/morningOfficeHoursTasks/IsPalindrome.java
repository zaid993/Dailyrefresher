package javaTasks.morningOfficeHoursTasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IsPalindrome {
 /*
        remove palindrome strings from a List of String
    */

    public static void main(String[] args) {
        List<String> pali=new ArrayList<>();
        pali.addAll(Arrays.asList("level","glass","mom","window","carpet"));
        System.out.println(removePalindromes1(pali));
    }

    //solution 1 -->Iterator
    public static List<String> removePalindromes1(List<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String word=it.next();
            String reversed="";
            for(int i=word.length()-1;i>=0;i--){
                reversed +=word.charAt(i);
            }
            if(word.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }

        return list;
    }




    //solution 2  -->Lambda Exp. removeIf
    public static List<String> removePalindromes2(List<String> list) {
        list.removeIf(p->isPalindrome(p));
        return list;
    }

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }



}
