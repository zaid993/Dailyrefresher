package JavaR.regular_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        // Anagram is basically two words with same letters like earth and heart ... silent and listen , race and care
        // we use .thCharAt() method for this one
        String st = "heart";
        String s2 = "earth";
        // get every char as char array

        char [] ch1 = st.toCharArray();
        char [] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        System.out.println("Arrays.equals(ch1,ch2) = " + Arrays.equals(ch1, ch2));


    }
}
