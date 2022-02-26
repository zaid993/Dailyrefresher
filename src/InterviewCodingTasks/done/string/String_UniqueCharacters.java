package InterviewCodingTasks.done.string;

public class String_UniqueCharacters {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println("unique(str) = " + unique(str));
        System.out.println("unique2(str) = " + unique2(str));


    }
    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static String unique(String str) {
        String[] arr = str.split("");
        String unique1 = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique1 += arr[j];
            }
        }

        return unique1;
    }


    public static String unique2(String str){
        String res = "";
        for (char each : str.toCharArray()) {
            if (str.indexOf(each)==str.lastIndexOf(each)){
                res+=each;
            }
        }
        return res;
    }





}
