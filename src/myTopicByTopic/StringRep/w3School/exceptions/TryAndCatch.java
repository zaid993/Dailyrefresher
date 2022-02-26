package myTopicByTopic.StringRep.w3School.exceptions;

public class TryAndCatch {
    public static void main(String[] args) throws InterruptedException {



       try{ int[] my = {1,2,3};
        System.out.println(my[10]);
       }catch (Exception e){
           System.out.println("Runtime exception");
       }finally {
           System.out.println("this finally block is executed in anyway");
       }

//        this is an uncheck exception and the best way is to Try {} Catch



        Thread.sleep(5000);


    }


}
