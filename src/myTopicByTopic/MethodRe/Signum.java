package myTopicByTopic.MethodRe;

import java.util.Scanner;

public class Signum {

    public static void sign(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num>0){
            System.out.println("positive");
        }else if (num<0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }

    }

    public static void main(String[] args) {
        sign();
    }





}
