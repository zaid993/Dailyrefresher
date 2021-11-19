package JavaR;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        // using
        String n = "jhg";
        String r = "";

        r+=n.charAt(2);
        r+=n.charAt(1);
        r+=n.charAt(0);
        System.out.println("r = " + r);

        //or

        String r2= ""+n.charAt(2)+n.charAt(1)+n.charAt(0);
        System.out.println("r2 = " + r2);


        // reverse with loop

        String str = "Zaid";
        String loopreverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            loopreverse+=str.charAt(i);

        }
        System.out.println("loopreverse = " + loopreverse);




//
//        System.out.println("Enter a sentence");
//
//        String str2 = new Scanner(System.in).nextLine();
//        String reverseStence = "";
//        for (int i = str2.length()-1; i >=0; i--) {
//            reverseStence+=str2.charAt(i);
//
//        }
//        System.out.println("reverseStence = " + reverseStence);
//




        // reverse array of ints with loop
         int [] nums = {1,2,3,4,5};

         // to reverse we need something to display reversed results with same size
        int [] reversed = new int[nums.length];

        //now get first... reverse it and add it to second

        for (int i = nums.length-1,j=0 ; i >=0 ; i--,j++) {
            reversed[j] = nums[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(reversed));


        // Reverse Sentence by split method and loop.. so split returns String array [] which has indexes

        String sentence = "I love Java Programming language";
        String[] arrraySenctence= sentence.split(" ");
        System.out.println(Arrays.toString(arrraySenctence));
        for (int i = arrraySenctence.length -1; i >=0; i--) {
            System.out.print(arrraySenctence[i]+" ");
        }







    }
}
