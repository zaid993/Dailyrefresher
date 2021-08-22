package StringReplits;

import java.util.Scanner;

public class catDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.nextLine();

        for (int i = 0; i <=word.length()-3 ; i++) {
            String each = word.substring(i,i+3);
            if (each.equals("cat")){
                countOfCats++;
            }
            if (each.equals("dog")){
                countOfDogs++;
            }

        }
if (countOfCats==countOfDogs){
    System.out.println("true");
}else {
    System.out.println("false");
}
        System.out.println("countOfDogs = " + countOfDogs);
        System.out.println("countOfCats = " + countOfCats);










    }
}
