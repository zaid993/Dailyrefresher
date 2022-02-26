package myTopicByTopic.StringRep;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
//        Write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given. There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.
//
//                > Poor = 5%
//                > Fair = 10%
//                > Good = 15%
//                > Great = 20%
//                > Excellent = 25%
//
//                The program should display the following information based on the user input:
//
//        Split or No split (Yes or No)
//        Number of people entered: (number) (each person = & in output)
//        Check amount: (number)
//                Service Quality: (String)
//                Total to pay:
//        Total tip:
//        Total per person:
//        Tip per person:
//
//```
//        Example
//
//        Input:
//        Yes
//        4
//        476.0
//        Excellent
//
//        Output:
//        Number of people entered: &&&&
//        Total to pay: 595.0
//        Total tip: 119.0
//        Total per person: 148.75
//        Tip per person: 29.75
//```
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No Split?");
        String split =scan.next();
        System.out.println("Number of people entered:");
        int numberOfPeople = scan.nextInt();
        System.out.println("Total to pay:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service grade");
        String serviceType = scan.next();

             double totalTip=0;

             double Totally = 0;

            double totalPerPerson=0;

            double tipPerPerson=0;

        if (serviceType.equalsIgnoreCase("Excellent")){
            totalTip+=checkAmount*0.25;
             Totally = totalTip+checkAmount;
            totalPerPerson+=Totally/numberOfPeople;
            tipPerPerson+= totalTip/numberOfPeople;
        }else if (serviceType.equalsIgnoreCase("Great")){
            totalTip+=checkAmount*0.20;
            Totally = totalTip+checkAmount;
            totalPerPerson+=Totally/numberOfPeople;
            tipPerPerson+= totalTip/numberOfPeople;
        }else if (serviceType.equalsIgnoreCase("Good")){
            totalTip+=checkAmount*0.15;
            Totally = totalTip+checkAmount;
            totalPerPerson+=Totally/numberOfPeople;
            tipPerPerson+= totalTip/numberOfPeople;
        }
        else if (serviceType.equalsIgnoreCase("Fair")){
            totalTip+=checkAmount*0.10;
            Totally = totalTip+checkAmount;
            totalPerPerson+=Totally/numberOfPeople;
            tipPerPerson+= totalTip/numberOfPeople;
        }else if (serviceType.equalsIgnoreCase("Poor")){
            totalTip+=checkAmount*0.05;
            Totally = totalTip+checkAmount;
            totalPerPerson+=Totally/numberOfPeople;
            tipPerPerson+= totalTip/numberOfPeople;
        }
        String signs = "";
        for (int i = 1; i <=numberOfPeople; i++ ){
            signs = signs + "&";
        }
        System.out.println("Number of people entered: "+signs);

        System.out.println("Total to pay: "+Totally);
        System.out.println("Total tip: "+totalTip);

        if (split.equalsIgnoreCase("yes")) {
            System.out.println("Total per person: "+totalPerPerson);
            System.out.println("Tip per person: "+tipPerPerson);

        }
        else if (split.equalsIgnoreCase("no")) {
            System.out.println("Total per person: "+"Not applicable");
            System.out.println("Tip per person: "+ "Not applicable");




        }























    }
}
