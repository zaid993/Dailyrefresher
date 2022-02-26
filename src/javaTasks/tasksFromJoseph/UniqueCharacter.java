package javaTasks.tasksFromJoseph;

public class UniqueCharacter {


/*
4. Find the Unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */

    public static void main(String[] args) {

          System.out.println("uniqueChars(\"AAABBBCCCDEF\") = " + uniqueChars2("AAABBBCCCDEF"));
         System.out.println("uniqueChars(\"AAABBBCCCDEF\") = " + uniqueChars("AAABBBCCCDEF"));
        System.out.println("uniqueChars(\"AAABBBCCCDEF\") = " + uniqueChars3("AAKABBBPCCCDEFF"));


    }


    /**
     * This method uses created earlier method for frequencyOfOneChar()
     *
     * @param str
     * @return
     */
    public static String uniqueChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (FrequencyOfChars.frequencyOfOneChar(str, str.charAt(i)) == 1) {
                result += str.charAt(i);
            }

        }


        return result;


    }

    /**
     * This method uses String methods( IndexOf())
     *
     * @param str
     * @return
     */
    public static String uniqueChars2(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }


    /**
     * This method uses String methods( contains())
     *
     * @param str
     * @return
     */
    public static String uniqueChars3(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String str2 = str.replaceFirst("" + str.charAt(i), "");
            if (!str2.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }



}
