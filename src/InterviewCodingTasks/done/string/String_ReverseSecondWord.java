package InterviewCodingTasks.done.string;

public class String_ReverseSecondWord {

    public static void main(String[] args) {
        String str = "I Love Java";
        System.out.println("secondWord(str) = " + secondWord(str));
        System.out.println("reverseSecondWord(str) = " + reverseSecondWord(str));
    }
    /*
    Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */


    public static String reverseSecondWord(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words[1].length() - 1; i >= 0; i--){
            reversed += words[1].charAt(i);
        }

        words[1] = reversed;
        String result = "";

        for (String each : words) {
            result += each + " ";
        }

        return result.trim();
    }



    public static String secondWord(String str){
        String [] words = str.split(" ");
        String secondWord = words[1];
        String rev="";
        for (int i = secondWord.length()-1; i >=0; i--) {
            rev+=secondWord.charAt(i);
        }
        words[1]=rev;
        String results ="";
        for (String each : words) {
            results+=each+" ";
        }
        return results;
    }

}
