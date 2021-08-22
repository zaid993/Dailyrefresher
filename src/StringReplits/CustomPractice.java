package StringReplits;

import java.util.Scanner;

public class CustomPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        odd(1,100);

        even(100,200);

        calculate(1993);

        eleigibilty(21,true,"green","french", 5.8);
        twoNumbers(100,200,'%');
    }













    public static void odd (int from, int to){

        for (int i = from; i <=to ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void even(int from, int to){
        for (int i = from; i <+ to; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();


    }

    public static void calculate (int ages){


        int currentyear = 2021;
        ages=currentyear-ages;
        System.out.println(ages);


    }
    public static void eleigibilty (int age, boolean isUSCitizen, String eye, String lang, double height){
        if (age>=18 && isUSCitizen ){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }        System.out.println();

    }

    public static void twoNumbers(int first, int last, char operator){

        switch (operator){
            case '+':
                System.out.println(first+last);
                break;
            case '-':
                System.out.println(first-last);
                break;
            case '*':
                System.out.println(first*last);
                break;
            case '/':
                System.out.println(first/last);
                break;
            case '%':
                System.out.println(first%last);
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }

}
