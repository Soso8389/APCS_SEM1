/*
 * Author: Soren
 * Date: (put today’s date here)
 */

import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Gringotts bank");
        System.out.println("We're going to create a bank account! What info do we know?");
        System.out.println("1. Nothing \n2. Owner \n3. Owner and Initial Deposit");

        int menuselect = sc.nextInt();
        sc.nextLine(); 

        
        BankAccount gringotts;

        if (menuselect == 1) {
            
            gringotts = new BankAccount("He who must not be named", 0);
        } 
        else if (menuselect == 2) {
            System.out.println("What is your name?");
            String name = sc.nextLine();

            gringotts = new BankAccount(name, 0); 
        } 
        else {
            System.out.println("What is your name?");
            String name = sc.nextLine();

            System.out.println("What is your initial deposit?");
            double deposit = sc.nextDouble();

            gringotts = new BankAccount(name, deposit);
        }

        System.out.println("\nAccount successfully created!");
        gringotts.displayAccountInfo();
    }
}
