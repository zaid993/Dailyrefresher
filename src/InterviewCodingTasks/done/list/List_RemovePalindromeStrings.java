package InterviewCodingTasks.done.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemovePalindromeStrings {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Zaid","Anna","nin"));


        //System.out.println("removePli(names) = " + removePli(names));
        System.out.println("paliListaO(names) = " + paliListaO(names));


    }

   /*
        remove palindrome strings from a List of String
    */


    // Solution
    public static List<String> removePli(List<String> lista){
        Iterator<String> it = lista.iterator();
        while (it.hasNext()){
            String word = it.next();
            String rev="";
            for (int i = word.length()-1; i >=0; i--) {
                 rev+=word.charAt(i);
            }
            if (word.equalsIgnoreCase(rev)){
                it.remove();
            }
        }
        return lista;
    }



    public static List<String> paliListaO(List<String> names ){
        names.removeIf(n -> isPali(n));
        return names;
    }

    public static boolean isPali (String str){
        boolean res = false;
        String rev = "";
        for (int i = str.length()-1; i >=0; i--) {
            rev+=str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)){
            res=true;
        }
        return res;
    }




    //solution 1:
    public List<String> removePalindromes1(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String word = it.next();
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)) {
                it.remove();
            }
        }
        return list;
    }



    //solution 2:
    public List<String> removePalindromes2(List<String> list) {
        list.removeIf(p -> isPalindrome(p));
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
