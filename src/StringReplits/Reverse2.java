package StringReplits;

public class Reverse2 {
    public static void main(String[] args) {
        String[] arr = {"java", "python", "C#","cyber", "selenium", "car"};
//        String e = arr[0];

    for( String e : arr){
        String rev = "";
        for (int i = e.length()-1; i >=0 ; i--) {
            rev+=e.charAt(i);

        }System.out.print(rev+" ");

    }











    }
}
