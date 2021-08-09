package daily;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            shoppingListReport += "Item" +count+ ": " + item+ " Price: "+price;

            System.out.println("Add one more item?");
            countinue = scan.next();
            if (countinue.equalsIgnoreCase("yes")) {
               shoppingListReport+=", ";
                count++;

            } else if (countinue.equalsIgnoreCase("no")) {



                System.out.println();
                break;
            }

        } while (count <= 10);


        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);
//
//
//
//
//
//
//
//
//
//
//
//
//
//        for (int i = 1; i <= count; i++) {
//            if (count <= i || count > 10) {
//                System.out.print("Item" + i + ": " + shoppingListReport.indexOf(i) + " price: " + price + ", ");
//            } else if (count >= 10) {
//                System.out.print("Item" + i + ": " + shoppingListReport.indexOf(i)  + " price: " + price);
//            }
//
//        }
//
//    }




    }}
