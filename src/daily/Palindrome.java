package daily;

public class Palindrome {
    public static void main(String[] args) {
        String[] arr = {"anna", "level", "java"};


        for (int j = 0; j < arr.length ; j++) {
            String name = arr[j];
            String rev = "";
            for (int i =name.length()-1; i >=0 ; i--) {
                rev+=name.charAt(i);

            }
            arr[j]+=rev;
            System.out.println(rev);

            if (rev==arr[j]){
                System.out.println("Palindrome");
            }
        }


    }
}
