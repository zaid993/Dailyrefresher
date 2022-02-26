package InterviewCodingTasks.done.string;

public class String_RemoveDuplicates {
    public static void main(String[] args) {
        String st = "AAABBBCCC";
        System.out.println("removeDup(st) = " + removeDup(st));
        System.out.println("removeDups(st) = " + removeDups(st));
    }


    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }



    public static String removeDups(String st){
        String res  = "";
        for (int i = 0; i < st.length()-1; i++) {
             if (!res.contains(""+st.charAt(i))){
                 res+=st.charAt(i);
             }

        }
        return res;
    }


}
