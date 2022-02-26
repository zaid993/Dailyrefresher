package InterviewCodingTasks.done.string;

public class String_IndexOfFirstUniqueChar {

    public static void main(String[] args) {
        String st = "AAASSSWTTRRG";
        System.out.println("indexOfFirstNonRepeatingChar(st) = " + indexOfFirstNonRepeatingChar(st));
        System.out.println("indexfirst(st) = " + indexfirst(st));
    }
    /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */

    public static int indexOfFirstNonRepeatingChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (char each : s.toCharArray()) {
                if (each == s.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int indexfirst(String st ){

        for (int i = 0; i < st.length(); i++) {

            int count =0;
            for (char each : st.toCharArray()) {
                if (each==st.charAt(i)){
                    count++;
                }
            }
            if (count==1){
                return i;
            }

        }
        return -1;
    }


}
