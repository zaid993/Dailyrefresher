package JavaR.Methods;

public class FrequencyMethod {
    public static void main(String[] args) {

//        System.out.println("freqOfOneChar(\"SSSWWEQWEWQEWQWQM\",'S') = "
//                + freqOfOneChar("SSSWWEQWEWQEWQWQM", 'S'));
//
//        System.out.println("frqNum(\"AABBCC\") = "
//                + frqNum("AABBCC"));
//
//        System.out.println("frqNum(\"AAAAAAAAAAAAAAAAAAAAAAAAWWWWWEEEERRRRTTTGGGFFF\") = "
//                + frqNum("AAAAAAAAAAAAAAAAAAAAAAAAWWWWWEEEERRRRTTTGGGFFF"));
//
//
//        System.out.println("wordFrequency(\"JAVA JAVA JAVA\",\"java\") = "
//                + wordFrequency("JAVA JAVA JAVA", "java"));
//
//        System.out.println("wordFrequency2(\"ZAID ZAID ZAID\", \"ZAID\") = " + wordFrequency2("ZAID ZAID ZAID", "ZAID"));


        System.out.println("news(\"bbbbnnnmmmkjjyttyttyytu\") = " + news("bbbbnnnmmmkjjyttyttyytu"));
    }

    // how many times a character occurred in the string
    public static int freqOfOneChar(String str, char ch){


        //find the frequency of first char
        int count =0;
        for (String each : str.split("")) {
            if (each.equalsIgnoreCase(""+ch)){
                count++;
            }
        }

        return count;
    }



    /// method to return frequncy of given string as A3B3C3

    public static String frqNum(String stt){


        String finalo = "";

        //first remove dups
        String removedDups="";
        for (int i = 0; i <= stt.length()-1; i++) {
            if (!removedDups.contains(""+stt.charAt(i))){
                removedDups+=stt.charAt(i);
            }
        }


        for (int j = 0; j < removedDups.length(); j++) {

            //put all inside another loop
            //frequency of first or one character
            char carcter = removedDups.charAt(j); // a, b, c
            int carFrq = 0; // the frequency of every one
            for (int i = 0; i < stt.length(); i++) {
                if (carcter==stt.charAt(i)){
                    carFrq++;
                }

            }
            finalo+= ""+carcter+carFrq;
        }

         return finalo;
    }




    public static String news(String str){
        String ret = "";

        // we first start removing duplicates
        String removedDups = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (!removedDups.contains(""+str.charAt(i))){
                removedDups+=str.charAt(i);
            }
        }

        //loop in the chars of the removed duplicastes
        for (int j = 0; j < removedDups.length()-1; j++) {

            //get the first char from removed duplicates and compare
            //it with original str
            char ch1 = removedDups.charAt(j);
            int frq = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch1==str.charAt(i)){
                    frq++;
                }
            }


            ret += ""+ch1+frq;
        }

        return ret;

    }

























// freq of a word in a sentence
    public static int wordFrequency(String sen, String wrda) {
       int frequency= 0;

        for (int i = 0; i <= sen.length()-wrda.length(); i++) {
             if (sen.substring(i,i+wrda.length()).equalsIgnoreCase(wrda)){
                 frequency++;
             }

        }
       return frequency;
    }






    // freq of a word in a sentence
    public static int wordFrequency2(String sentence, String word) {
        int frd= 0;
        sentence =sentence.toLowerCase();
        word=word.toLowerCase();
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frd++;
           }
        return frd;
    }


}
