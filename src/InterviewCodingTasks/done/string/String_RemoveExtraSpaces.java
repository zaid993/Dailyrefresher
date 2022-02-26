package InterviewCodingTasks.done.string;

public class String_RemoveExtraSpaces {

    public static void main(String[] args) {
       String st = "  Hello world      I      love      Java    ";
        System.out.println("spaceFree(st) = " + spaceFree(st));

    }
    /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java

     */

    public static String spaceFree(String str){

        String [] st = str.trim().split(" ");
        String res = "";
        for (String each : st) {
            if (!each.isEmpty()){
                res+=each+" ";
            }

        }
        return res;

    }


    public String removeExtraSpace(String sentence) {

        String[] words = sentence.trim().split(" ");
        String result = "";

        for (String each : words) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }

        return result.trim();

    }


}
