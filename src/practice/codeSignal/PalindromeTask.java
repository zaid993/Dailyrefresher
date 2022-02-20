package practice.codeSignal;

public class PalindromeTask {

    public static void main(String[] args) {
        System.out.println("pal(\"anna\") = " + pal("anna"));
        System.out.println("pal(\"zaid\") = " + pal("zaid"));


    }







    public static boolean pal(String inputString) {
        String reverse = "";

        for ( int i = inputString.length()-1 ; i >= 0 ; i--){
            reverse+=inputString.charAt(i);
        }

        if(inputString.equalsIgnoreCase(reverse)){
            return true;
        }else{
            return false;
        }

    }








}
