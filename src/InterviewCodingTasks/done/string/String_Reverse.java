package InterviewCodingTasks.done.string;

public class String_Reverse {
    public static void main(String[] args) {
        String str = "Name";
        str=str.toLowerCase();
        System.out.println("rev(str) = " + rev(str));
        System.out.println("StrReverse(str) = " + StrReverse(str));

    }
    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;

    }

    public static String rev(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }

}
