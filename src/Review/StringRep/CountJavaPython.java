package Review.StringRep;

import java.util.Scanner;

public class CountJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int py = 0;
        int ja = 0;

        for (int i = 0; i <=sentence.length()-6 ; i++) {
            String eachtime= sentence.substring(i,i+6);

            if (eachtime.equals("python")){
                py++;
            }
            
        }
        for (int i = 0; i <=sentence.length()-4 ; i++){
            String eachjava = sentence.substring(i,i+4);
            if (eachjava.equals("java")){
                ja++;
            }
        }



        System.out.println("ja = " + ja);
        System.out.println("py = " + py);
        if (py==ja){
            System.out.println("true");
        }else {
            System.out.println("false");
        }






        
    }
}
