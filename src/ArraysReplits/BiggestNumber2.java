package ArraysReplits;
import java.util.*;

class Zaid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
        int greatest = arr[0][0];
        for (int[] row:arr){
            for (int column:row){
                if (greatest<column){
                    greatest=column;

                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            int [] each = arr[i];
            for (int j = 0; j < each.length; j++) {
                each[j]=greatest;
            }
        }



        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));


    }
}