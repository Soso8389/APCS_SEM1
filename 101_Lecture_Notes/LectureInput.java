/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double item1 = 5.0;
        double item2 = 100000000.0;
        double item3 = 20;
        double item4 = 3.50;
        double item5 = 4.50;
        System.out.println("Welcome to Soren's Java house ☕☕☕");
        System.out.println("Here is our menu");
        System.out.println("☕Black coffee - $5");
        System.out.println("🎃☕PSL - take out a morgage");
        System.out.println("🍵 Matcha latte - $20");
        System.out.println("🥮Danish - $3.50");
        System.out.println("🍭Cake pop - $4.50");
        System.out.println("What is the name for the order?");
        String name = sc.nextLine();
        
        
        System.out.println("How many black coffees would you like?");
        int quantity1 = sc.nextInt();
        sc.nextLine();
        System.out.println("How many PSLs would you like?");
        int quantity2 = sc.nextInt();
        sc.nextLine();
        System.out.println("How many Matcha lattes would you like?");
        int quantity3 = sc.nextInt();
        sc.nextLine();
        System.out.println("How many Danishes would you like?");
        int quantity4 = sc.nextInt();
        sc.nextLine();
        System.out.println("How many Cake pops would you like?");
        int quantity5 = sc.nextInt();
        sc.nextLine();
        
        if (quantity2 >= 1){
            System.out.println("Please sign your full name to take out a morgage for your  " + quantity2 + "  Pumpkin spice lattes");
            String fullname = sc.nextLine();
            System.out.println("Thank you, " + fullname + " you have one year to repay your morgage(s)");
            
        }
        
        double total1 = item1 * quantity1;
        double total2 = quantity2;
        double total3 = item3*quantity3;
        double total4 = item4*quantity4;
        double total5 = item5*quantity5;
        double total = total1 + total2 + total3 + total4 + total5;
        System.out.println("How much would you like to tip?");
        double tip = sc.nextDouble();
        System.out.println("----------------------");
        System.out.println(name + "'s Receipt");
        System.out.println(quantity1 + "  black coffees  "+ total1);
        System.out.println(quantity2 + "  PSL morgages  ");
        System.out.println(quantity3 + "  Matcha lattes  " + total3);
        System.out.println(quantity4 + "  Danishes  " + total4);
        System.out.println(quantity5 + "  Cakepops  " + total5);
        double grand_total = total * tip /100;
        System.out.println("----------------------");
        System.out.println("Grand total:  " + grand_total);
        System.out.println("----------------------");
        System.out.println("Thank you for dining at Soren's Java house!");
        
	}
}
