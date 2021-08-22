package ArraysReplits;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.

        for (int i = 0; i < binary.length; i++) {
            binary[i]=decimal%2;
            decimal=decimal/2;
        }
        System.out.println(Arrays.toString(binary));
    }








}
