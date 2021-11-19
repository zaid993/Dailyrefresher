package JavaR;

public class Frequency {

    public static void main(String[] args) {

        String str = "java java";
        int f = 0;

        for (int i = 0; i <= str.length()-4; i++) {
            if (str.substring(i,i+4).equalsIgnoreCase("java")){
                f++;
            }

        }
        System.out.println("f = " + f);


        // frequency of any word

        String str2 = "Python Python";
        int f2 = 0;

        for (int i = 0; i <= str2.length()-6; i++) {
            if (str2.substring(i,i+6).equalsIgnoreCase("Python")){
                f2++;
            }

        }
        System.out.println("f2 = " + f2);






        // frequency of any word
        String str3 = "c# C# C# C# C#";
        String word = "C#";
        int f3 = 0;

        for (int i = 0; i <= str3.length()-word.length(); i++) {
            if (str3.substring(i,i+word.length()).equalsIgnoreCase(word)){
                f3++;
            }

        }
        System.out.println("f3 = " + f3);


        // using contains method with while
        String sent = "java java fun, java is cool";
        String wrd = "java";
        int Count = 0;

        while (sent.contains(wrd)){
            Count++;
            sent = sent.replaceFirst("java","");

        }
        System.out.println("Count = " + Count);

        System.out.println("------------------------------------------------");



        // frequency of character using regular loop
        String sqn = "ccmmccncmcmcffds";

        char ch = 'f';
        int frqncy = 0;

        for (int index = 0; index <= sqn.length()-1; index++) {
             if (sqn.charAt(index)==ch){
                 frqncy++;
             }
        }
        System.out.println("frqncy = " + frqncy);


        for (int i = 0; i <= 8; i++) {
            System.out.println("*");

        }


        System.out.println("--------------------------------------");








        /// using nested loop to get a2b1c3
        String string = "aabccc";

        String finalResult = "";
        String dups= "";


        //1- remove duplicated
        for (int i = 0; i <= string.length()-1; i++) {

            if (!dups.contains(""+string.charAt(i))){
             dups+=string.charAt(i);
            }else {
                continue;
            }

        }
        System.out.println("dups = " + dups);


        //create loop to go through non-duplicated String
        for (int j = 0; j <= dups.length()-1; j++) {


            //frequency of first or one character
            char ch3 = dups.charAt(j); // a, b, c
            int frqs = 0; // the frequency of every one
            for (int i = 0; i <= string.length()-1; i++) {

                if (string.charAt(i) == ch3){
                    frqs++;}
                                                          }

            finalResult += ""+ch3+ frqs;
                                             }

        System.out.println("finalResult = " + finalResult);



    }
}
