package pkg;
import java.util.*;

public class BankAccount {
    // -------GLOBAL VARIABLES-------
    String name;
    double amt;
    int accountNum;

    // -------CONSTRUCTORS-------
    public BankAccount(String n, double b) {
        name = n;
        amt = b;
        accountNum = 100 + (int)(Math.random() * 900); 
    }

    // -------METHODS-------
    public void displayAccountInfo() {
        System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + accountNum);
        System.out.println("Balance: " + amt + " galleons");
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + amt+" galleons");
    }
}
