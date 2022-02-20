package Review.StringRep;

import java.util.Scanner;

public class WithoutLastLEtter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.println(txt.substring(0,txt.length()-1));




}}
