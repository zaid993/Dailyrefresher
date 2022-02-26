package javaTasks.tasksFromJoseph;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfOneChar {


    public static void main(String[] args) {
        System.out.println("frequency(\"JavaJava\", 'a') = " + frequency("JavaJava", 'a'));
        System.out.println("frequency1(\"Ivana\", 'a') = " + frequency1("Ivana", 'a'));
        System.out.println("frequency2(\"Anna\", 'n') = " + frequency2("Anna", 'n'));
    }

    /**
     * Frequency of one char using toCharArray() and forEach loop
     * @param str
     * @param ch
     * @return
     */
    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()) {
            if(each == ch){
                count++;
            }
        }
        return count;
    }


    /**
     * Frequency of one char using for i loop
     * @param str
     * @param ch
     * @return
     */
    public static int frequency1(String str, char ch){
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c==ch){
                frequency++;
            }
        }
        return frequency;
    }

    /**
     * Frequency of one char using Collections.frequency()
     * @param str
     * @param ch
     * @return
     */
    public static int frequency2(String str, char ch){

       int  frequency = Collections.frequency(Arrays.asList( str.split("")),ch);
        return frequency;
    }
}
