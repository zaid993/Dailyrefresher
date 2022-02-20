package Review.ArraysRe;
import java.util.*;

class Main {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
        int biggestNum = 0;
        for (int[] row : arr){
            for (int column: row){
                if (biggestNum<column){
                    biggestNum=column;
                }
            }
        }
        System.out.println(biggestNum);
    }//end main
}