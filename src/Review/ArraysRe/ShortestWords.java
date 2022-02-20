package Review.ArraysRe;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            // write your code below

                String[] arr= str.split(", ");

                String firstShortest = arr[0];
                String secondShortest = "";
               for (String each : arr) {
                 if (each.length()<firstShortest.length()) {
                     firstShortest=each;

            }}
               for (String each : arr){
                   if (each.length()==firstShortest.length()){
                       secondShortest+=each+", ";
                   }
               }


               String[] twoShortest = secondShortest.split(", ");
        Arrays.sort(twoShortest);
        System.out.println(Arrays.toString(twoShortest));
    }
}
