package JavaR.regular_Methods;

public class RemoveDuplicates {
    public static void main(String[] args) {


        //using a know length word
        String w = "aabbcc";

        String result = "";

        if (!result.contains(""+w.charAt(0))){
            result+=""+w.charAt(0);
        }
        if (!result.contains(""+w.charAt(1))){
            result+=""+w.charAt(1);
        }
        if (!result.contains(""+w.charAt(2))){
            result+=""+w.charAt(2);
        }
        if (!result.contains(""+w.charAt(3))){
            result+=""+w.charAt(3);
        }
        if (!result.contains(""+w.charAt(4))){
            result+=""+w.charAt(4);
        }
        if (!result.contains(""+w.charAt(5))){
            result+=""+w.charAt(5);
        }


        System.out.println("result = " + result);




        // using loop
        String word= "absababdasd";
        String r ="";

        for (int i = 0; i <= word.length()-1; i++) {
            if (!r.contains(""+word.charAt(i))){
                r+=word.charAt(i);
            }
        }

        System.out.println("r = " + r);





    }
}
