package myTopicByTopic.Exceptions;

public class Tasks {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 1; i <=30; i++) {
            System.out.println("Push up number "+i);
            Thread.sleep(250);

        }

        System.out.println("------------------");
        for (int i = 1; i <=20; i++) {
            System.out.println("pull up number "+i);
            Thread.sleep(500);

        }


    }
}
