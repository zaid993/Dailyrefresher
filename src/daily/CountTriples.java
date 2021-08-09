package daily;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        for (int i = 0; i <=str.length()-3;i++ ){
            String eactTime = ""+str.charAt(i)+str.charAt(i)+str.charAt(i);
            if (eactTime.equalsIgnoreCase(str.substring(i,i+3))){
                count++;
            }

        }
        System.out.println(count);





    }
}
