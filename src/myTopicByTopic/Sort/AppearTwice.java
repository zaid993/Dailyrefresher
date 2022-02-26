package myTopicByTopic.Sort;

public class AppearTwice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
       boolean result = false;
       if (sentence.contains(target)){
           result=true;
       }

        return result;
    }
}