package StringReplits;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int countjava = 0;
    for (int i = 0; i <=word.length()-4;i++ ){
        String eactTime = word.substring(i,i+4);
        if (eactTime.equals("java")){
            countjava++;
        }

    }
        System.out.println(countjava);





    }
}
