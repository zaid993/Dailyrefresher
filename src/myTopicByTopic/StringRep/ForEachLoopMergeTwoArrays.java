package myTopicByTopic.StringRep;

import java.util.Arrays;

public class ForEachLoopMergeTwoArrays {
    public static void main(String[] args) {
    String[] str1 = {"A","B","C"};
        String[] str2 = {"D","F","G"};

        String[] str3 = new String[str1.length+str2.length];
        int j = 0;
        for (String each1 : str1){
            str3[j++]=each1;
        }
        for (String each2:str2) {

            str3[j++]=each2;
        }
        System.out.println(Arrays.toString(str3));
        System.out.println();

        int[] num = {1,2,3,4,5,6,7,8,9};
        int even = 0;
        int odd = 0;
        for (int each : num){
            if (each%2==0){
                even++;
            }else{
                odd++;
            }
    }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
}
}
