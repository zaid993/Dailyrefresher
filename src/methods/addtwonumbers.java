package methods;

import java.util.Scanner;

public class addtwonumbers {
    public static void main(String[] args) {
        plus(1,'+',3);
    }

    // Do not touch above

    public static void plus(int num1, char sign, int num2 ){
        //your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int number1= scan.nextInt();
        System.out.println("enter second number:");
        int number2 = scan.nextInt();

        int result = number1+number2;
        System.out.println("result = " + result);
    }
}
