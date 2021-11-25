package JavaR.Methods;

public class PalindromeMethod {

    public static void main(String[] args) {

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


}
