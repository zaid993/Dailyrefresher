package InterviewCodingTasks.done.string;

public class String_FirstUniqueCharacter {

    public static void main(String[] args) {
        String st = "AASXXXWWWG";

        System.out.println("firstNonRepeatedChar(st) = " + firstNonRepeatedChar(st));
        System.out.println("firsChar(st) = " + firsChar(st));


    }
    /*
    write a program that can return the first non-repeated character from a string
     */

    public static char firstNonRepeatedChar(String str) {

        for (int i = 0; i < str.length(); i++) {

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                return str.charAt(i);
            }

        }

        return ' ';

    }


    public static char firsChar(String st) {

        for (int j = 0; j < st.length(); j++) {
            int fr = 0;
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == st.charAt(j)) {
                    fr++;
                }
            }
            if (fr==1){
                return st.charAt(j);
            }
        }
        return ' ';
    }
}