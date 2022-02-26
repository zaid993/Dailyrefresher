package myTopicByTopic.oopRep.printAttribute;

import java.util.Scanner;

 class main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Atts a = new Atts();
            a.name = in.next();
            a.color = in.next();
            a.amount = in.nextInt();

            System.out.println(a.asString());
        }
    }
