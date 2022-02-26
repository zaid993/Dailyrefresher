package myTopicByTopic.ArraysRe;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

            int day = 0;
            int population = 0;
            do {
                System.out.println("Day " + day +" "+ Arrays.toString(inhabitants));
                population=0;
                for (int i = 0; i < inhabitants.length; i++) {
                     inhabitants[i] = inhabitants[i]/2;
                    population+=inhabitants[i];
                }
                day++;
            } while (population > 0);

        System.out.println("Day " + day +" "+ Arrays.toString(inhabitants));
        System.out.println("----EXTINCT----");




    }
}
