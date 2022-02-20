package practice.JavaR.Methods;

public class PalindromeMethod {

    public static void main(String[] args) {

//        System.out.println("isPlaindrome(\"zaid\") = " + isPlaindrome("zaid"));
//        System.out.println("isPlaindrome(\"anna\") = " + isPlaindrome("anna"));

        System.out.println("Pli(\"Zaid\") = " + Pli("Zaid"));
        System.out.println("Pli(\"Anna\") = " + Pli("Anna"));


    }

    public static boolean isPlaindrome(String str){
        boolean isPalindrome = false;

        if (ReverseMethod.reverse(str).equalsIgnoreCase(str)){
            System.out.println("isPalindrome = " + isPalindrome);
            isPalindrome = true;
        }else{
            System.out.println("Is not palindrome");
        }
        return isPalindrome;
    }


    // means the reverse equals the string

    public static boolean Pli (String str){
        boolean isP = false;

        String rev = "";
        for (int i = str.length()-1; i >=0; i--) {
            rev+=str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)){
            isP=true;
        }
        return isP;
    }








}
