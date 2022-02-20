package Review.ArraysRe;

import java.util.Arrays;
import java.util.Scanner;

public class has55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:

        String news = Arrays.toString(nums);
        System.out.println(news);
        if (news.contains("5, 5")){
            System.out.println("true");
        }else{
            System.out.println("falser");
        }

    }
}
