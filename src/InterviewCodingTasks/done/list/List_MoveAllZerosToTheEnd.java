package InterviewCodingTasks.done.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>(Arrays.asList(1,0,0,0,0,2,3,4,5,6,7,8,9));
        System.out.println(moveZerosToTheEnd(ll));
        System.out.println("MoveZeroes(ll) = " + MoveZeroes(ll));

    }

    /*
    write a program that can move all the zeros to the end of the List of integers
     */

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }

    public static List<Integer> MoveZeroes(List<Integer> lista){
        int originalSize=lista.size();
        lista.removeAll(Arrays.asList(0));
        int newSize = lista.size();
        int difference = originalSize-newSize;

        for (int i = 0; i < difference; i++) {
             lista.add(0);
        }
    return lista;}


}
