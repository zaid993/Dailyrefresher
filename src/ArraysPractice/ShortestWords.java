package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            // write your code below

                String[] arr= str.split(",");

        String shortest = arr[0];
        int count = 0;
        for (String each : arr) {
            if (shortest.length()>each.length()) {
                count++;
                shortest=each;

            }


        }
        System.out.println(shortest);
        System.out.println(count);



//                Arrays.sort(arr);
//            System.out.println(Arrays.toString(arr));

    }
}
