package myTopicByTopic.StringRep;

public class UniqueChars {
    public static void main(String[] args) {
        char[] ch = {'A','B','A','A','S','F','B','H','E','T'};



       for (char All : ch){

        int count  = 0;

        for (char each : ch){
            if (each==All)
            count++;

        }
           if (count==1){
               System.out.println(All);
           }
       }


    }
}
