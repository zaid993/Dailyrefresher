package practice.JavaR.Methods;

public class ReverseMethod {

    public static void main(String[] args) {

        System.out.println("reverse(\"Zaid\") = "
                + reverse("Zaid"));

        System.out.println("PalindromeMethod.isPlaindrome(\"Anna\") = "
                + PalindromeMethod.isPlaindrome("Anna"));


        System.out.println("rev(\"Zaid\") = " + rev("Zaid"));

    }


    public static String reverse(String str){
        String res = "";
        for (int i = str.length()-1; i >= 0; i--) {
            res+=str.charAt(i);
        }
        return res;
    }



    public static String rev(String str){
        String rev = "";
        for (int i = str.length()-1; i >=0 ;i--){
            rev+=str.charAt(i);
        }

        return rev;
    }


}
