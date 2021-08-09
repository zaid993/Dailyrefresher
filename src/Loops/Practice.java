package Loops;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String input = "today it will be 100 degrees !";
        int n = 0;

        while(n++ < input.length()) {
            System.out.println("value of n: " + n);
            if (n == 8) {
                continue;
            } else if (n == 9) {
                break;
            }

            System.out.println(input.charAt(++n));
        }

        }
    }



