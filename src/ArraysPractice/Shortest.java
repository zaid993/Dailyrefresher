package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Shortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};





        String shortest="";
        String secondWords="";

        for (String words : str) {
            String[] splitted = words.split(", ");
            for (int i = 0; i <= splitted.length-1; i++) {
                for (String each : splitted) {
                    if (shortest.length()>each.length()){
                        shortest=each;
                    }
                    System.out.print(Arrays.toString(splitted));
                }
            }



        }





//        for (int i = 0; i <= str.length-1; i++) {
//            shortest = str[i];
//            for (String each : str) {
//                if (shortest.length()>each.length()){
//                    shortest=each;
//                } }
//        }
//        System.out.println(shortest);



   }
}
