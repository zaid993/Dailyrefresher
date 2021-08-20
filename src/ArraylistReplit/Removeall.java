package ArraylistReplit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Removeall {
    //create your method below
    public static ArrayList<String> removeAll(ArrayList<String>wordList, String targetWord){
        wordList.removeAll(Arrays.asList(targetWord));
        return wordList;
    }








    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        if (size == 7) {
            for (int i = 0; i < size-1; i++) {
                list.add(in.next());
            }
        }else {
            for (int i = 0; i < size; i++) {
                list.add(in.next());
            }
        }

        System.out.println(removeAll(list, target));
}}
